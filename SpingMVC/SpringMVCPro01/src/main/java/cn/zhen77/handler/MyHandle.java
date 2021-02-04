package cn.zhen77.handler;

import jdk.nashorn.internal.ir.IfNode;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : zhen77
 * @date: 2021/2/4 - 02 - 04 - 15:07
 * @Description: cn.zhen77.handler
 * @version: 1.0
 */
public class MyHandle implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("进入controller之前要做的事 比如:权限检查,登陆检查");
        String name = httpServletRequest.getParameter("username");
        if("admin".equals(name)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("正在执行controller方法 但是没有获得返回值的时候,要做的事情:初始化菜单和数据的时候");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("执行完controller方法之后,要做的事情:日志记录,异常处理...");
    }
}
