package startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Auther: weiliang
 * @Date: 2020/12/28 15:17
 * @Description:
 */
@Component
@Order(2)
public class FirstCommandlineRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println(">>>startup first runner<<<");

	}
}
