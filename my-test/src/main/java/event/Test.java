package event;

/**
 * @Auther: weiliang
 * @Date: 2020/12/21 17:36
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();
		RainListener rainListener = new RainListener();
		SnowListener snowListener = new SnowListener();
		eventMulticaster.addListener(rainListener);
		eventMulticaster.addListener(snowListener);
		eventMulticaster.multicastEvent(new SnowEvent());
		eventMulticaster.multicastEvent(new RainEvent());
		eventMulticaster.removeListener(rainListener);
		eventMulticaster.multicastEvent(new SnowEvent());
		eventMulticaster.multicastEvent(new RainEvent());
	}
}
