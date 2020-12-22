package event.event1;

/**
 * @Auther: weiliang
 * @Date: 2020/12/21 17:15
 * @Description:
 */
public class WeatherEventMulticaster extends AbstractEventMulticaster {
	 void doStart() {
		System.out.println("begin broadcast weather event");
	}

	 void doEnd() {
		 System.out.println("end broadcast weather event");
	 }
}
