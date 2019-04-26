/**
 * Create Date:2019年4月26日
 */
package com.huangqingfeng.cms.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huangqingfeng.cms.domain.Friend;
import com.huangqingfeng.cms.domain.Message;
import com.huangqingfeng.cms.domain.User;
import com.huangqingfeng.cms.service.UserService;
import com.huangqingfeng.cms.util.RedisUtil;

/**
 * @作者： 黄庆丰
 * @时间： 2019年4月26日
 */
@Controller
public class UserController {
  @Autowired
  private UserService us;

  @Autowired
  private KafkaTemplate<Integer, String> kt;

  @Autowired
  private RedisUtil redisUtil;

  @RequestMapping("/login")
  @ResponseBody
  public int login(String uname, String upwd, HttpSession session) {

    User user = us.loginUser(uname);
    System.out.println(user);
    if (user != null) {
      if (user.getUpwd().equals(upwd)) {
        redisUtil.hset(user.getUname(), user.getUid() + "", user);
        session.setAttribute("user", user);
        return 1;
      } else {
        return 2;
      }
    }

    return 0;

  }

  @RequestMapping("/list")
  public String list(String uname, Model m, HttpSession session) {
    User user = (User) session.getAttribute("user");
    List<Friend> list = us.selectFriends(user.getUid());
    List<User> list2 = new ArrayList<User>();
    for (Friend friend : list) {
      User u = us.selectUserById(friend.getFid());

      list2.add(u);
    }

    m.addAttribute("list", list2);
    return "list";
  }

  @RequestMapping("addly")
  public String addLy(Message message) {
    message.setSdate(new Date());
    kt.sendDefault(message.toString());
    return "redirect:list";

  }
}
