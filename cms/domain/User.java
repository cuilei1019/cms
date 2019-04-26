/**
 * Create Date:2019年4月26日
 */
package com.huangqingfeng.cms.domain;

import java.io.Serializable;

/**
 * @作者： 黄庆丰
 * @时间： 2019年4月26日
 */

public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  private int uid;

  private String uname;

  private String upwd;

  private String nickname;

  public User() {
    super();
  }

  @Override
  public String toString() {
    return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", nickname=" + nickname + "]";
  }

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public String getUpwd() {
    return upwd;
  }

  public void setUpwd(String upwd) {
    this.upwd = upwd;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

}
