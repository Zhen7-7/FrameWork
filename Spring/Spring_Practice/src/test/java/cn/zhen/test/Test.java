package cn.zhen.test;

import cn.zhen77.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : zhen77
 * @date: 2021/2/10 - 02 - 10 - 11:49
 * @Description: cn.zhen.test
 * @version: 1.0
 */

public class Test {
    @org.junit.Test
    public void test1(){
        //1.加载配置文件:
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //  获得user对象
        User user = (User) app.getBean("us1");
        System.out.println(user);

    }

    @org.junit.Test
    public void test2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)app.getBean("us2");
        System.out.println(user);
    }
}
