package event.event2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: weiliang
 * @Date: 2020/12/21 17:15
 * @Description:
 */
@Component
public class WeatherRunListener {

	// 注入广播器
	@Autowired
	private WeatherEventMulticaster eventMulticaster;

	public void snow() {
		eventMulticaster.multicastEvent(new SnowEvent());
	}

	public void rain() {
		eventMulticaster.multicastEvent(new RainEvent());
	}
}
