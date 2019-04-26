/**
 * Create Date:2019年4月26日
 */
package com.huangqingfeng.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huangqingfeng.cms.domain.Friend;
import com.huangqingfeng.cms.domain.Message;
import com.huangqingfeng.cms.domain.User;

/**
 * @作者： 黄庆丰
 * @时间： 2019年4月26日
 */
public interface UserMapper {
  public User loginUser(@Param("uname") String uname);

  public List<Friend> selectFriends(@Param("uid") int uid);

  public User selectUserById(@Param("uid") int fid);

  public void insertMessage(@Param("m") Message m);
}
