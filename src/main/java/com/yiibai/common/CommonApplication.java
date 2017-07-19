package com.yiibai.common;

import com.yiibai.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xl on 2017/6/13.
 */
public class CommonApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        //CustomerService cust = (CustomerService) applicationContext.getBean("customerService");
        CustomerService cust = (CustomerService) applicationContext.getBean("customerServiceProxy");//运行 HijackBeforeMethod 的 before() 方法，在每个 CustomerService 的方法之前执行。
        //它将运行 HijackAfterMethod 的 afterReturning()方法，在每次 CustomerService 方法返回结果之后。
        CustomerService cust1 = (CustomerService) applicationContext.getBean("customerServiceProxy1");
        //抛出后通知
        CustomerService cust2 = (CustomerService) applicationContext.getBean("customerServiceProxy2");
        CustomerService cust3 = (CustomerService) applicationContext.getBean("customerServiceProxy3");

        //为什么引入'切入点'的原因。它允许你通过它的方法名来拦截方法。另外，一个“切入点”必须具有“Advisor' 相关联。
        CustomerService cust4 = (CustomerService) applicationContext.getBean("customerServiceProxy4");

//        System.out.println("*************************");
//        cust.printName();
//        System.out.println("*************************");
//        cust.printURL();
//        System.out.println("*************************");

//        System.out.println("*************************");
//        cust1.printName();
//        System.out.println("*************************");
//        cust1.printURL();
//        System.out.println("*************************");
//
//        System.out.println("*************************");
//        cust2.printName();
//        System.out.println("*************************");
//        cust2.printURL();
//        System.out.println("*************************");

//        System.out.println("*************************");
//        cust3.printName();
//        System.out.println("*************************");
//        cust3.printURL();
//        System.out.println("*************************");

        System.out.println("*************************");
        cust4.printName();
        System.out.println("*************************");
        cust4.printURL();
        System.out.println("*************************");
        try {
            cust.printThrowException();
        } catch (Exception e) {

        }
    }
}
