package cn.zhen77.test;

import cn.zhen77.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : zhen77
 * @date: 2021/1/29 - 01 - 29 - 14:11
 * @Description: cn.zhen77.test
 * @version: 1.0
 */
public class SpringTest {
    @Test
    public void test1(){
        //1.加载配置文件:
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.获得User对象
        User user = (User)app.getBean("us1");

        user.setUid(1);
        user.setUname("猪猪");
        user.setUage(18);
        user.setUsex("女");

        System.out.println(user);

        //通过使用有参构造创建对象
        User user2=(User)app.getBean("us2");
        System.out.println(user2);
    }
    @Test
    public void TestOfFactory(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

//        User user = (User)app.getBean("us3");
//        System.out.println(user);
//        User user = (User)app.getBean("us4");
//        System.out.println(user);
//        User user = (User)app.getBean("us5");
//        System.out.println(user);
        User user = (User)app.getBean("us6");
        System.out.println(user);
    }
}
