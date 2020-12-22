package event1;

import event.event2.WeatherRunListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: weiliang
 * @Date: 2020/12/21 18:21
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Sb2ApplicationTests {

	@Autowired
	private WeatherRunListener weatherRunListener;

	@Test
	public void contextLoad(){
	}

	@Test
	public void testEvent() {
		weatherRunListener.rain();
		weatherRunListener.snow();
	}
}
