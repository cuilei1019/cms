package RedisTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KafkaConsumerTest {

  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-kafka-consumer.xml");
  }
}
