/**
 * Create Date:2019年4月25日
 */
package RedisTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @作者： 黄庆丰
 * @时间： 2019年4月25日
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-kafka-producer.xml" })
public class KafkaProducerTest {

  @Autowired
  private KafkaTemplate<Integer, String> kafkaTemplate;

  @Test
  public void testSendMsg() {
    kafkaTemplate.sendDefault("hello Java Producer kafka");
  }
}