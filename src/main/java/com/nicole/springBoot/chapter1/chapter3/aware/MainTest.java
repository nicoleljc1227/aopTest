package com.nicole.springBoot.chapter1.chapter3.aware;

import com.nicole.springBoot.chapter1.AopConfigure;
import com.nicole.springBoot.chapter1.DemoAnnotationService;
import com.nicole.springBoot.chapter1.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**spring aware 所有的bean对spring容器本身是没有意识的，但是一旦项目中药用到Spring容器本身提供的功能就，就需要使用spring aware
 *
 * 使得Bean和Spring框架耦合
 * Created by xl on 2017/7/31.
 *
 * ApplicationContext接口集成了MessageSource接口，ApplicationEventPublisher接口，和ResourceLoader接口
 *
 * 只要Bean继承ApplicationContextAware接口就可以获取spring容器的所有服务
 */
public class MainTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }
}
