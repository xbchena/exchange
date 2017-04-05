/**
 * Project Name:finanframe
 * File Name:IpUtils.java
 * Package Name:com.wanda.finanframe.util
 * Date:2016年9月28日下午2:52:52
 * Copyright (c) 2016, wanda.cn All Rights Reserved.
 *
 */
package com.iss.finanframe.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author jgh
 *
 */
public class IpUtils {

//    public static void main(String [] args){  
//        InetAddress netAddress = getInetAddress();  
//        System.out.println("host ip:" + getHostIp(netAddress));  
//        System.out.println("host name:" + getHostName(netAddress));  
//    }  
  
    public static InetAddress getInetAddress(){  
  
        try{  
            return InetAddress.getLocalHost();  
        }catch(UnknownHostException e){  
            System.out.println("unknown host!");  
        }  
        return null;  
  
    }  
  
    public static String getHostIp(InetAddress netAddress){  
        if(null == netAddress){  
            return null;  
        }  
        String ip = netAddress.getHostAddress(); //get the ip address  
        return ip;  
    }  
  
    public static String getHostName(InetAddress netAddress){  
        if(null == netAddress){  
            return null;  
        }  
        String name = netAddress.getHostName(); //get the host address  
        return name;  
    }  
	
}
