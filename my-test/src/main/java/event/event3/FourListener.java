package event.event3;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * @Auther: weiliang
 * @Date: 2020/12/21 20:59
 * @Description:
 */
@Order(4)
public class FourListener implements SmartApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("hello 4");

	}

	@Override
	public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
		return ApplicationStartedEvent.class.isAssignableFrom(eventType);
	}
}























