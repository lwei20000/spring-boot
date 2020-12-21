package event1;

import org.springframework.stereotype.Component;

/**
 * @Auther: weiliang
 * @Date: 2020/12/21 17:15
 * @Description:
 */
@Component
public class WeatherEventMulticaster extends AbstractEventMulticaster {
	 void doStart() {
		System.out.println("begin broadcast weather event");
	}

	 void doEnd() {
		 System.out.println("end broadcast weather event");
	 }
}
