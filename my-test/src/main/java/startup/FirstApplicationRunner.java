package startup;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
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
public class FirstApplicationRunner implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(">>> first application runner <<< ");
	}
}
