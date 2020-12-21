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
@Order(3)
public class ThirdInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		ConfigurableEnvironment environment =  applicationContext.getEnvironment();
		Map<String, Object> map = new HashMap<>();
		map.put("key3", "value");
		MapPropertySource mapPropertySource = new MapPropertySource("firstInitilizer3", map);
		environment.getPropertySources().addLast(mapPropertySource);
		System.out.println("=====================> run firstInitializer3");
	}
}























