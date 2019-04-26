/**
 * Create Date:2019年4月26日
 */
package com.huangqingfeng.cms.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @作者： 黄庆丰
 * @时间： 2019年4月26日
 */
public class Message implements Serializable {
  private static final long serialVersionUID = 1L;

  private int mid;

  private String xx;

  private int uid;

  private int fid;

  private Date sdate;

  public Message() {
    super();
  }

  @Override
  public String toString() {
    return mid + "," + xx + "," + uid + "," + fid + "," + sdate;
  }

  public Message(String xx, int uid, int fid, Date sdate) {
    super();
    this.xx = xx;
    this.uid = uid;
    this.fid = fid;
    this.sdate = sdate;
  }

  public int getMid() {
    return mid;
  }

  public void setMid(int mid) {
    this.mid = mid;
  }

  public String getXx() {
    return xx;
  }

  public void setXx(String xx) {
    this.xx = xx;
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

  public Date getSdate() {
    return sdate;
  }

  public void setSdate(Date sdate) {
    this.sdate = sdate;
  }

}
