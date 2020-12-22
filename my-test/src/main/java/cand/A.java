package cand;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @Auther: weiliang
 * @Date: 2020/12/22 16:24
 * @Description:
 */
@Component
@ConditionalOnProperty("com.mooc.condition") //存在属性com.mooc.condition时，才加载这个类。
public class A {
}
