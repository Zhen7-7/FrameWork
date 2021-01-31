package cn.zhen77.test;

import cn.zhen77.aop.proxy01.UserService;
import cn.zhen77.aop.proxy01.UserServiceImpl;
import cn.zhen77.aop.proxy01.UserServiceProxy;
import cn.zhen77.aop.proxy02.JDKProxy;
import cn.zhen77.aop.proxy02.StudentService;
import cn.zhen77.aop.proxy02.StudentServiceImpl;
import cn.zhen77.aop.proxy03.CGLibproxy;
import cn.zhen77.aop.proxy03.UserSub;
import cn.zhen77.aop.proxy03.UserSuper;
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
    @Test
     public void test2() throws Exception{
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JDKProxy jdkProxy = (JDKProxy) app.getBean("jdkproxy");
        StudentService student = (StudentService)jdkProxy.createProxyInstance(new StudentServiceImpl());
        student.add();

        UserService user = (UserService) jdkProxy.createProxyInstance( new  UserServiceImpl());
        user.add();
        user.delet();
    }
    @Test
    public  void test3(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        CGLibproxy cglibproy = (CGLibproxy) app.getBean("cglibproxy");
        UserSuper userSuper = (UserSuper) cglibproy.createProxyInstance(new UserSub());
        userSuper.add();
    }
    @Test
    public void test4() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationSpring.xml");
        cn.zhen77.aop.springxml.UserService user = (cn.zhen77.aop.springxml.UserService) app.getBean("usi");
        user.add();
        user.delete();

    }







}
