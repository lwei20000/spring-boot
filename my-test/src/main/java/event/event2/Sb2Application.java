package event.event2;

import initializer.initializer.SecondInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb2Application {
	public static void main(String[] args) {
		// 启动方式一
		//SpringApplication.run(Sb2Application.class,args);

		// 启动方式二
		SpringApplication springApplication = new SpringApplication(Sb2Application.class);
		springApplication.addInitializers(new SecondInitializer());
		springApplication.run(args);

	}
}
