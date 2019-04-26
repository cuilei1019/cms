/**
 * Create Date:2019年4月26日
 */
package com.huangqingfeng.cms.domain;

/**
 * @作者： 黄庆丰
 * @时间： 2019年4月26日
 */
public class Friend {
  private int id;

  private int uid;

  private int fid;

  public Friend() {
    super();
  }

  @Override
  public String toString() {
    return "Friend [id=" + id + ", uid=" + uid + ", fid=" + fid + "]";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }

  public int getFid() {
    return fid;
  }

  public void setFid(int fid) {
    this.fid = fid;
  }

}
