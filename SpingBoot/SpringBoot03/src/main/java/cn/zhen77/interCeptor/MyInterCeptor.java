package cn.zhen77.interCeptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : zhen77
 * @date: 2021/2/9 - 02 - 09 - 16:18
 * @Description: cn.zhen77.interCeptor
 * @version: 1.0
 */
@Component//当你不知道当前类是哪一层还需要创建Bean对象时就是用该注解
public class MyInterCeptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("进入拦截器MyInterCeptor里,执行拦截..");
        return false;
    }
}
