package com.iss.finanframe.util;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iss.finanframe.exception.FinanFrameException;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class SFTPUtil {

	public static Logger logger = LoggerFactory.getLogger(SFTPUtil.class);

	/**
	 * 
	 * @param username 用户名
	 * @param password 密码
	 * @param host  ip
	 * @param port  端口
	 * @return
	 * @throws Exception
	 */
	public static ChannelSftp connect(String username, String password, String host, int port) throws Exception {
		JSch jsch = new JSch();
		jsch.getSession(username, host, port);
		Session sshSession = jsch.getSession(username, host, port);
		if(logger.isDebugEnabled()){
			logger.debug("Session created.");		
		}
		sshSession.setPassword(password);
		Properties sshConfig = new Properties();
		sshConfig.put("StrictHostKeyChecking", "no");
		sshSession.setConfig(sshConfig);
		sshSession.connect();
		if(logger.isDebugEnabled()){
			logger.debug("Session connected.");
			logger.debug("Opening Channel.");
		}
		Channel channel = sshSession.openChannel("sftp");
		channel.connect();
		ChannelSftp sftp = (ChannelSftp) channel;
		if(logger.isDebugEnabled()){
			logger.debug("Connected to " + host + ".");
		}
		return sftp;
	}

	/**
	 * Disconnect with server
	 */
	public static void disconnect(ChannelSftp sftp) {
		if (sftp != null) {
			if (sftp.isConnected()) {
				sftp.disconnect();
				if(logger.isDebugEnabled()){
					logger.debug("sftp is closed");					
				}
			} else if (sftp.isClosed()) {
				if(logger.isDebugEnabled()){
					logger.debug("sftp is already closed");
				}
			}
		}

	}

	/**
	 * 下载
	 * @param directory   需要下载的文件所在的目录，绝对路径
	 * @param downloadFile  需要下载的文件名称
	 * @param saveFile  保存在本地后文件命名
	 * @param sftp
	 */
	public static void downloadToFile(String directory, String downloadFile, String saveFile, ChannelSftp sftp) throws Exception{
		sftp.cd(directory);
		File file = new File(saveFile);
		sftp.get(downloadFile, new FileOutputStream(file));
		sftp.disconnect();
		if(logger.isDebugEnabled()){
			logger.debug(file + " downloaded" );
		}
	}

	public static InputStream downloadToStream(ChannelSftp sftp,String directory, String downloadFile) throws Exception{
		sftp.cd(directory);
		InputStream in = sftp.get(downloadFile);
		sftp.disconnect();
		return in;
	}
	
	public static String downloadToString(ChannelSftp sftp,String directory, String downloadFile) throws Exception{
		InputStream in = downloadToStream(sftp,directory,downloadFile);
		StringBuilder resultBuffer = new StringBuilder();
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
            	if(sftp.isConnected()){
                	sftp.disconnect();             		
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
	 * 上传
	 * @param fileListPath
	 * @param localPath
	 * @param remotePath
	 * @param seperator
	 * @param sftp
	 */
	public static void upload(String fileListPath, String localPath, String remotePath, String seperator, ChannelSftp sftp) throws Exception{
		List<String> fileList = getFileEntryList(fileListPath);
		if (fileList != null) {
			for (String filepath : fileList) {
				String localFile = localPath + seperator + filepath;
				File file = new File(localFile);

				if (file.isFile()) {
					if(logger.isDebugEnabled()){
						logger.debug("localFile : " + file.getAbsolutePath());						
					}
					String remoteFile = remotePath + seperator + filepath;
					if(logger.isDebugEnabled()){
						logger.debug("remotePath:" + remoteFile);
					}
					File rfile = new File(remoteFile);
					String rpath = rfile.getParent();
					try {
						createDir(rpath, sftp);
					} catch (Exception e) {
						if(logger.isDebugEnabled()){
							logger.debug("*******create path failed" + rpath);
						}
					}
					sftp.put(new FileInputStream(file), file.getName());
					if(logger.isDebugEnabled()){
						logger.debug("=========upload down for " + localFile);						
					}
				}
			}
		}

	}

	/**
	 * create Directory
	 * 
	 * @param filepath
	 * @param sftp
	 */
	public static void createDir(String filepath, ChannelSftp sftp) throws Exception{
		boolean bcreated = false;
		boolean bparent = false;
		File file = new File(filepath);
		String ppath = file.getParent();
		try {
			sftp.cd(ppath);
			bparent = true;
		} catch (SftpException e1) {
			bparent = false;
		}
		if (bparent) {
			try {
				sftp.cd(filepath);
				bcreated = true;
			} catch (Exception e) {
				bcreated = false;
			}
			if (!bcreated) {
				sftp.mkdir(filepath);
				bcreated = true;
			}
			return;
		} else {
			createDir(ppath, sftp);
			sftp.cd(ppath);
			sftp.mkdir(filepath);
		}
		sftp.cd(filepath);

	}

	/**
	 * get all the files need to be upload or download
	 * 
	 * @param file
	 * @return
	 */
	private static List<String> getFileEntryList(String file) {
		ArrayList<String> fileList = new ArrayList<String>();
		InputStream in = null;
		try {

			in = new FileInputStream(file);
			InputStreamReader inreader = new InputStreamReader(in);

			LineNumberReader linreader = new LineNumberReader(inreader);
			String filepath = linreader.readLine();
			while (filepath != null) {
				fileList.add(filepath);
				filepath = linreader.readLine();
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				in = null;
			}
		}

		return fileList;
	}

//	public static void main(String[] args) throws Exception {
//		SFTPUtil sf = new SFTPUtil();
//		String host = "10.199.203.227";
//		int port = 22;
//		String username = "appuser";
//		String password = "Kikimali808";
//		String directory = "/home/appuser/uppeage";
//		String downloadFile = "logback.xml";
//		String saveFile = "D:\\logback.xml";
//		ChannelSftp sftp = sf.connect(username, password, host, port);
//		sf.download(directory, downloadFile, saveFile, sftp);
//		sf.disconnect(sftp);
//	}


}
