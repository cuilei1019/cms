package com.huangqingfeng.cms.kafka;

import java.util.Date;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.listener.MessageListener;

import com.huangqingfeng.cms.domain.Message;
import com.huangqingfeng.cms.service.UserService;

public class KafkaConsumerListener implements MessageListener<Integer, String> {

  @Autowired
  private UserService us;

  public void onMessage(ConsumerRecord<Integer, String> data) {

    System.out.println("接受到的消息" + data.value());
    String str = data.value();
    String[] split = str.split(",");

    Message m = new Message(split[1], Integer.parseInt(split[2]), Integer.parseInt(split[3]), new Date());

    us.insertMessage(m);
    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

  }

}
