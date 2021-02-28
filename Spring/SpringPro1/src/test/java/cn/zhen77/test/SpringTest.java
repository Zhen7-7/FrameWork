package cn.zhen77.test;

import cn.zhen77.pojo.Student;
import cn.zhen77.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

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
    @Test
    public void Test2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");//若是立即加载,该语句直接会调用无参的构造方法
        //默认是单例设计模式 singleton创建一次对象
        //将scope设置prototype (原型) 每次创建不同的对象
        Student student =(Student) app.getBean("stu");
        Student student2 =(Student) app.getBean("stu");
        System.out.println(student==student2);

    }
    @Test
    public void TestDI1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContextDI.xml");
        Student student = (Student)app.getBean("student");
//        System.out.println(student.toString());
        for (int i: student.getScore()){
            System.out.println("分数是"+i);
        }
        for(int i=0;i<student.getScore().length;i++){
            System.out.println("分数是"+student.getScore()[i]);
        }
        for (int i:student.getList()){
            System.out.println(i);
        }
        for (int i:student.getSet()){
            System.out.println(i);
        }
        //迭代器
        Iterator<Integer> it=student.getSet().iterator();
        while (it.hasNext()){
            System.out.println("迭代器得出"+it.next());
        }
        //方式1:
        HashMap<String,Integer> map = (HashMap<String, Integer>) student.getMap();
        System.out.println(map);
        //方式2:
        for (String s:student.getMap().keySet()){
            System.out.println(s+"->"+student.getMap().get(s));
        }
        //方式3:
        for (int i: student.getMap().values()){
            System.out.println(i);
        }
        //方法4:迭代器
        Iterator<String> it1 = student.getMap().keySet().iterator();
        while(it1.hasNext()){
            String str = it1.next();
            System.out.println(str+"="+student.getMap().get(str));
        }
        //方式5:
        for(Map.Entry<String,Integer> m : student.getMap().entrySet() ){
            System.out.println(m.getKey()+"--"+m.getValue());
        }
        System.out.println("------------------------------------------");
        Properties pros = student.getPros();
        String str1 = pros.getProperty("username");
        String str2 = pros.getProperty("password");
        System.out.println(str1+"->"+str2);

    }
    @Test
    public void estDI2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContextDI.xml");
        Student stu = (Student) app.getBean("stuAutowire");
        System.out.println(stu);
    }
}
