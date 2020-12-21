package event1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: weiliang
 * @Date: 2020/12/21 17:15
 * @Description:
 */
@Component
public abstract class AbstractEventMulticaster implements EventMulticaster {

	@Autowired
	private List<WeatherListener> listenerList;

	@Override
	public void multicastEvent(WeatherEvent event) {
		doStart();
		listenerList.forEach(i->i.onWeatherEvent(event));
		doEnd();
	}

	abstract void doStart();

	abstract void doEnd();

	@Override
	public void addListener(WeatherListener event) {
		listenerList.add(event);
	}

	@Override
	public void removeListener(WeatherListener event) {
		listenerList.remove(event);
	}
}
