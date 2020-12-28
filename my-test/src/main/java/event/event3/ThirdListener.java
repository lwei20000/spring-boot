package event.event3;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * @Auther: weiliang
 * @Date: 2020/12/21 20:59
 * @Description:
 */
@Order(3)
public class ThirdListener implements ApplicationListener<ApplicationEvent> {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("hello 3");

	}
}























