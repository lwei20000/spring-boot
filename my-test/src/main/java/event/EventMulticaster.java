package event;

/**
 * @Auther: weiliang
 * @Date: 2020/12/21 17:15
 * @Description:
 */
public interface EventMulticaster {
	void multicastEvent(WeatherEvent event);
	void addListener(WeatherListener event);
	void removeListener(WeatherListener event);
}
