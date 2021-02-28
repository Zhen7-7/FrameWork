package cn.zhen77.aop.proxy02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : zhen77
 * @date: 2021/1/31 - 01 - 31 - 9:26
 * @Description: cn.zhen77.aop.proxy02
 * @version: 1.0
 */
public class JDKProxy implements InvocationHandler {
    private Object targetObject;//代理的目标对象

    //产生代理对象：
    public Object createProxyInstance(Object targetObject){
        this.targetObject=targetObject;
/**
 * 参数一     ClassLoader   类加载器
 * 参数二：   Interfaces  接口类型
 * 参数三：   InvocationHandler  代理对象
 * */
        return Proxy.newProxyInstance(
                this.targetObject.getClass().getClassLoader(),
                this.targetObject.getClass().getInterfaces(),
                this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        check();
        Object invoke = method.invoke(this.targetObject, args);
        log();
        return invoke;
    }

    public  void  check(){
        System.out.println("权限检查");
    }

    public  void  log(){
        System.out.println("日志记录");
    }

}
