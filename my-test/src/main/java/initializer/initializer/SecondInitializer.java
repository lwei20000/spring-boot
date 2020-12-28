package initializer.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * 系统初始化器
 *
 * @Auther: weiliang
 * @Date: 2020/12/21 11:34
 * @Description:
 */
@Order(2)
public class SecondInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		ConfigurableEnvironment environment =  applicationContext.getEnvironment();
		Map<String, Object> map = new HashMap<>();

		// 放入一些系统属性
		map.put("key2", "value2");

		MapPropertySource mapPropertySource = new MapPropertySource("firstInitilizer2", map);
		environment.getPropertySources().addLast(mapPropertySource);
		System.out.println("=====================> run firstInitializer2");
	}
}























