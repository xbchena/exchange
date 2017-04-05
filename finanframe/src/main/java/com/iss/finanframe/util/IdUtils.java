package com.iss.finanframe.util;
import java.util.UUID;


/**
 * 用于生成ID的工具类
 */
public class IdUtils {

  public static String generate(String idPrefix) {
    return idPrefix + UUID.randomUUID().toString();
  }
  
}
