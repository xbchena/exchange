package com.iss.finanframe.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;

import com.thoughtworks.xstream.core.util.Base64Encoder;

import net.iharder.Base64;


public class Encrypt {
	/**
	 * 
	 * 功能:将字符串转化为16位的MD5密文
	 * 
	 * @param str
	 *            字符串
	 * @return
	 */
	public static String encryptMD5(String str) {
		String encryptStr = null;
		if (str == null)
			return null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			encryptStr = hash.toString(16).toUpperCase();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encryptStr;
	}
	
    // 加密  
    public static String getBase64(String str) {  
        byte[] b = null;  
        String s = null;  
        try {  
            b = str.getBytes("utf-8");  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
        if (b != null) {  
            s = new Base64Encoder().encode(b);  
        }  
        return s;  
    }  
  
    //解密  
    public static String getFromBase64(String s) {  
        byte[] b = null;  
        String result = null;  
        if (s != null) {  
        	Base64Encoder decoder = new Base64Encoder();  
            try {  
                b = decoder.decode(s);  
                result = new String(b, "utf-8");  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
        return result;  
    }  
    
    private static final int CACHE_SIZE = 1024;

    public static byte[] decode(String base64)
      throws Exception
    {
      return Base64.decode(base64.getBytes());
    }

    public static String encode(byte[] bytes)
      throws Exception
    {
      return new String(Base64.encodeBytes(bytes));
    }

    public static String encodeFile(String filePath)
      throws Exception
    {
      byte[] bytes = fileToByte(filePath);
      return encode(bytes);
    }

    public static void decodeToFile(String filePath, String base64)
      throws Exception
    {
      byte[] bytes = decode(base64);
      byteArrayToFile(bytes, filePath);
    }

    public static byte[] fileToByte(String filePath)
    {
      byte[] data = new byte[0];
      File file = new File(filePath);
      if (file.exists()) {
        FileInputStream in = null;
        ByteArrayOutputStream out = null;
        try
        {
          in = new FileInputStream(file);
        } catch (FileNotFoundException e) {
          e.printStackTrace();
        }
        out = new ByteArrayOutputStream(2048);
        byte[] cache = new byte[1024];
        int nRead = 0;
        try {
          while ((nRead = in.read(cache)) != -1) {
            out.write(cache, 0, nRead);
            out.flush();
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
        finally
        {
          try
          {
            out.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
          try {
            in.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
        data = out.toByteArray();
      }
      return data;
    }

    public static void byteArrayToFile(byte[] bytes, String filePath)
      throws Exception
    {
      InputStream in = new ByteArrayInputStream(bytes);
      File destFile = new File(filePath);
      if (!destFile.getParentFile().exists()) {
        destFile.getParentFile().mkdirs();
      }
      destFile.createNewFile();
      OutputStream out = new FileOutputStream(destFile);
      byte[] cache = new byte[1024];
      int nRead = 0;
      while ((nRead = in.read(cache)) != -1) {
        out.write(cache, 0, nRead);
        out.flush();
      }
      out.close();
      in.close();
    }
}
