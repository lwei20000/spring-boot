package event;

/**
 * @Auther: weiliang
 * @Date: 2020/12/21 17:15
 * @Description:
 */
public class SnowListener implements WeatherListener {
	@Override
	public void onWeatherEvent(WeatherEvent event) {
		if (event instanceof SnowEvent) {
			System.out.println("hello: " + event.getWeather());
		}
	}
}
