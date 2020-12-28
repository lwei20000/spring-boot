package initializer;

import initializer.initializer.SecondInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb2Application {
	public static void main(String[] args) {
		// 实现方式一：
		//SpringApplication.run(Sb2Application.class,args);

		// 实现方式二：
		SpringApplication springApplication = new SpringApplication(Sb2Application.class);
		springApplication.addInitializers(new SecondInitializer()); // 加入系统初始化器
		springApplication.run(args);

	}
}
