package event.event1;

/**
 * @Auther: weiliang
 * @Date: 2020/12/21 17:15
 * @Description:
 */
public class RainListener implements WeatherListener {
	@Override
	public void onWeatherEvent(WeatherEvent event) {
		if (event instanceof RainEvent) {
			System.out.println("hello: " + event.getWeather());
		}
	}
}
