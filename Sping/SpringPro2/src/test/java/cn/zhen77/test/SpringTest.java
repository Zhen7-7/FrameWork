package cn.zhen77.test;

import cn.zhen77.aop.proxy01.UserService;
import cn.zhen77.aop.proxy01.UserServiceProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : zhen77
 * @date: 2021/1/30 - 01 - 30 - 17:17
 * @Description: cn.zhen77.test
 * @version: 1.0
 */
public class SpringTest{
    @Test
    public void test() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService usi = (UserService) app.getBean("usi");
        usi.add();
        usi.delet();
    }
    @Test
    public void test1() throws Exception {
        ApplicationContext  app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService)app.getBean("proxy");
        userService.add();
        userService.delet();
    }

}
