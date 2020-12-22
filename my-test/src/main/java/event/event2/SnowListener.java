package event.event2;

import org.springframework.stereotype.Component;

/**
 * @Auther: weiliang
 * @Date: 2020/12/21 17:15
 * @Description:
 */
@Component
public class SnowListener implements WeatherListener {
	@Override
	public void onWeatherEvent(WeatherEvent event) {
		if (event instanceof SnowEvent) {
			System.out.println("hello: " + event.getWeather());
		}
	}
}
