/**
 * Create Date:2019年4月21日
 */
package RedisTest;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.huangqingfeng.cms.domain.Message;
import com.huangqingfeng.cms.service.UserService;

/**
 * @作者： 黄庆丰
 * @时间： 2019年4月21日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
  "classpath:applicationContext-redis.xml" })
public class RedisTest {
  /* private static final Logger logger = Logger.getLogger(User.class);*/
  @Autowired
  private UserService us;

  @Test
  public void test01() {
    us.insertMessage(new Message("456", 1, 2, new Date()));
  }
}
