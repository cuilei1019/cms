package com.huangqingfeng.cms.util;

import java.security.MessageDigest;
import java.util.UUID;

import sun.misc.BASE64Encoder;

public class UUIDUtils {
  //利用UUID,生成 32位不重复的  由 0-9  a-f(16进制字符)组成的字符串
  public static String generateID() {
    return UUID.randomUUID().toString().replaceAll("-", "");
  }

  public static String generateCode() {
    return UUIDUtils.generateID() + UUIDUtils.generateID();
  }

  //md5加密摘要
  public static String md5(String str) {
    String newstr = null;
    try {
      MessageDigest md5 = MessageDigest.getInstance("MD5");
      BASE64Encoder base64en = new BASE64Encoder();
      newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
    } catch (Exception e) {
      e.printStackTrace();
    }
    return newstr;
  }

  //返回不重复的任意用户名
  public static String generateRandomStr(int len) {
    //  index    012345678901234567890123456789012345
    String source = "0123456789ABCDEFGHIGKLMNOPQRSTUVWXYZ";
    String rtnStr = "";
    for (int i = 0; i < len; i++) {
      //	       循环随机获得当次字符，并移走选出的字符
      String nowStr = String.valueOf(source.charAt((int) Math.floor(Math.random() * source.length())));
      rtnStr += nowStr;
      source = source.replaceAll(nowStr, "");
    }
    return rtnStr;
  }

  public static void main(String[] args) {
    //		String newPwd = md5("111111");
    //		System.out.println(newPwd);
    //		String s  = generateID();
    //		System.out.println(s);
    for (int i = 1; i <= 10; i++) {
      String ss = generateRandomStr(6);
      System.out.println(ss);
    }
    System.out.println("----------------");

    String sss = generateID();
    System.out.println(sss);
  }
}
