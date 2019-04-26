/**
 * Create Date:2019年4月26日
 */
package com.huangqingfeng.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huangqingfeng.cms.dao.UserMapper;
import com.huangqingfeng.cms.domain.Friend;
import com.huangqingfeng.cms.domain.Message;
import com.huangqingfeng.cms.domain.User;

/**
 * @作者： 黄庆丰
 * @时间： 2019年4月26日
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
  @Autowired
  private UserMapper um;

  @Override
  public User loginUser(String uname) {

    return um.loginUser(uname);
  }

  @Override
  public List<Friend> selectFriends(int uid) {
    // TODO Auto-generated method stub
    return um.selectFriends(uid);
  }

  @Override
  public User selectUserById(int fid) {
    // TODO Auto-generated method stub
    return um.selectUserById(fid);
  }

  @Override
  public void insertMessage(Message m) {
    um.insertMessage(m);

  }

}
