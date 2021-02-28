package cn.zhen77.aop.springaspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author : zhen77
 * @date: 2021/1/31 - 01 - 31 - 15:17
 * @Description: cn.zhen77.aop.springxml
 * @version: 1.0
 */
@Aspect
@Component
public class Advice {
    @Before("execution(* cn.zhen77.aop.springaspectj.UserServiceImpl.add*(..))")
    public void check(){
        System.out.println("权限检查");
    }
    @After("execution(* cn.zhen77.aop.springaspectj.UserServiceImpl.add*(..))")
    public void log(){
        System.out.println("日志记录");
    }
}
