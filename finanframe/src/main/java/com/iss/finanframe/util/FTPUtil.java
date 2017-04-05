/**
 * Project Name:finanframe
 * File Name:FTPUtil.java
 * Package Name:com.wanda.finanframe.util
 * Date:2016年9月20日上午11:14:05
 * Copyright (c) 2016, wanda.cn All Rights Reserved.
 *
 */
package com.iss.finanframe.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iss.finanframe.exception.FinanFrameException;

public class FTPUtil {

	public static Logger logger = LoggerFactory.getLogger(FTPUtil.class);
	
    /** 
     * 获取FTPClient对象 
     * @param ftpHost FTP主机服务器 
     * @param ftpPassword FTP 登录密码 
     * @param ftpUserName FTP登录用户名 
     * @param ftpPort FTP端口 默认为21 
     * @return 
     */  
    public static FTPClient getFTPClient(String ftpUserName,String ftpPassword, String ftpHost, int ftpPort,String encodeing,int fileType) throws Exception{  
        FTPClient ftpClient = null;  
        try {  
            ftpClient = new FTPClient();  
            ftpClient.connect(ftpHost, ftpPort);// 连接FTP服务器  
            ftpClient.login(ftpUserName, ftpPassword);// 登陆FTP服务器  
            ftpClient.setControlEncoding(encodeing); // 中文支持  
            ftpClient.setFileType(fileType);  
            if (!FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {  
            	if(logger.isDebugEnabled()){
                    logger.debug("未连接到FTP，用户名或密码错误。");              		
            	}
                ftpClient.disconnect();  
            } else {  
            	if(logger.isDebugEnabled()){
            		logger.debug("FTP连接成功。"); 
            	}
            }  
        } catch (SocketException e) {  
            e.printStackTrace();  
            logger.error("FTP的IP地址可能错误，请正确配置。");  
            throw new FinanFrameException(e);
        } catch (IOException e) {  
            e.printStackTrace();  
            logger.error("FTP的端口错误,请正确配置。");  
            throw new FinanFrameException(e);
        }  
        return ftpClient;  
    }  
    
	public static InputStream downloadToStream(FTPClient ftpClient,String ftpPath,String fileName) throws Exception{
		InputStream in = null; 
		ftpClient.enterLocalPassiveMode();  
        ftpClient.changeWorkingDirectory(ftpPath);  
        in = ftpClient.retrieveFileStream(fileName); 
        ftpClient.disconnect();  
		return in;
	}
    
    /** 
     * 去 服务器的FTP路径下上读取文件 
     *  
     * @param ftpUserName 
     * @param ftpPassword 
     * @param ftpPath 
     * @param FTPServer 
     * @return 
     */  
    public static String downloadToString(FTPClient ftpClient,String ftpPath,String fileName)  throws Exception{  
        StringBuilder resultBuffer = new StringBuilder();  
        InputStream in = null;
        try {  
             in = downloadToStream(ftpClient,ftpPath,fileName);  
        } catch (Exception e) {  
            e.printStackTrace();  
            throw new FinanFrameException(e);  
        }  
        if (in != null) {  
            BufferedReader br = new BufferedReader(new InputStreamReader(in));  
            String data = null;  
            try {  
                while ((data = br.readLine()) != null) {  
                    resultBuffer.append(data + "\n");  
                }  
            } catch (IOException e) {  
                logger.error("文件读取错误。");  
                e.printStackTrace();  
                throw new FinanFrameException(e);
            }finally{  
                try {  
                	if(ftpClient.isConnected()){
                        ftpClient.disconnect();                 		
                	}
                } catch (IOException e) {  
                    e.printStackTrace();  
                    throw new FinanFrameException(e);
                }  
            }  
        }else{  
        	if(logger.isDebugEnabled()){
                logger.debug("InputStream为空，不能读取。");       		
        	}
            throw new FinanFrameException("InputStream为空"); 
        }  
        return resultBuffer.toString();  
    }  
    
    /** 
     * 本地上传文件到FTP服务器 
     *  
     * @param ftpPath 
     *            远程文件路径FTP 
     * @throws IOException 
     */  
    public static void upload(FTPClient ftpClient,String ftpPath,String fileContent,  String writeTempFielPath)  throws Exception{  
        if(logger.isDebugEnabled()){
        	logger.debug("开始上传文件到FTP.");  
        }
        try {  
            // 设置PassiveMode传输  
            ftpClient.enterLocalPassiveMode();  
            // 设置以二进制流的方式传输  
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);  
            // 对远程目录的处理  
            String remoteFileName = ftpPath;  
            if (ftpPath.contains("/")) {  
                remoteFileName = ftpPath.substring(ftpPath.lastIndexOf("/") + 1);  
            }  
            // FTPFile[] files = ftpClient.listFiles(new  
            // String(remoteFileName));  
            // 先把文件写在本地。在上传到FTP上最后在删除  
            boolean writeResult = write(remoteFileName, fileContent, writeTempFielPath);  
            if (writeResult) {  
                File f = new File(writeTempFielPath + "/" + remoteFileName);  
                InputStream in = new FileInputStream(f);  
                ftpClient.storeFile(remoteFileName, in);  
                in.close(); 
                if(logger.isDebugEnabled()){
                	 logger.info("上传文件" + remoteFileName + "到FTP成功!");  
                }
                f.delete();  
            } else {  
                logger.info("写文件失败!");  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }finally{  
            try {  
                ftpClient.disconnect();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
  
    /** 
     * 把配置文件先写到本地的一个文件中取 
     *  
     * @param ftpPath 
     * @param str 
     * @return 
     */  
    public static boolean write(String fileName, String fileContext,  String writeTempFielPath)  throws Exception{  
        File f = new File(writeTempFielPath + "/" + fileName);  
        if(!f.exists()){  
            if(!f.createNewFile()){  
                throw new FileNotFoundException();
            }  
        }  
        BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));  
        bw.write(fileContext.replaceAll("\n", "\r\n"));  
        bw.flush();  
        bw.close();  
        return true;  
    }  
    
}
