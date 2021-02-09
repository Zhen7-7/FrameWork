package cn.zhen77.test;

import cn.Application;
import cn.zhen77.pojo.Person;
import cn.zhen77.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : zhen77
 * @date: 2021/2/9 - 02 - 09 - 10:26
 * @Description: cn.zhen77.test
 * @version: 1.0
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {
    @Autowired //通过类型自动注入
    @Qualifier("userId1")
    private User user;//要谁注入谁

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Test
    public void test1(){
        System.out.println(user);
    }
    @Autowired
    @Qualifier("personId2")
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Test
    public void test2(){
        System. out.println(person);
    }
}
