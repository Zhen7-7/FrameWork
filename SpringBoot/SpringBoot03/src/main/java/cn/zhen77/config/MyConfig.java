package cn.zhen77.config;

import cn.zhen77.interCeptor.MyInterCeptor;
import cn.zhen77.pojo.Person;
import cn.zhen77.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : zhen77
 * @date: 2021/2/9 - 02 - 09 - 10:20
 * @Description: cn.zhen77.config
 * @version: 1.0
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Bean//创建bean对象
    protected User userId1(){
        User user = new User();
        user.setId(10);
        user.setName("李四");
        return user;
    }
    @Bean
    protected User userId2(){
        User user = new User();
        user.setId(11);
        user.setName("王五");
        return user;
    }
    @Bean
    protected Person personId1(){
        Person person = new Person();
        person.setPid(013);
        person.setUser(userId1());
        return person;
    }
    @Bean
    protected Person personId2(User userId2){
        Person person = new Person();
        person.setPid(013);
        person.setUser(userId2);
        return person;
    }
    //还是那个句话 没有对象就注入进来
    @Autowired
    private MyInterCeptor myInterCeptor;

    public MyInterCeptor getMyInterCeptor() {
        return myInterCeptor;
    }

    public void setMyInterCeptor(MyInterCeptor myInterCeptor) {
        this.myInterCeptor = myInterCeptor;
    }

    @Override
    //该方法配置拦截器拦截路径的映射
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterCeptor).addPathPatterns("/**").excludePathPatterns("/login");
    }
}
