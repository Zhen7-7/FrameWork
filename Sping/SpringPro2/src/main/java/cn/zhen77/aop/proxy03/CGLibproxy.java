package cn.zhen77.aop.proxy03;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : zhen77
 * @date: 2021/1/31 - 01 - 31 - 9:51
 * @Description: cn.zhen77.aop.proxy03
 * @version: 1.0
 */
public class CGLibproxy implements MethodInterceptor {
    private Object targetObject;//代理的目标对象

    //产生代理对象：
    public Object createProxyInstance(Object targetObject){
        this.targetObject=targetObject;
        Enhancer en=new Enhancer();//该类用于生成子类的代理对象
        en.setSuperclass(this.targetObject.getClass()); //设置父类
        en.setCallback(this); //设置回滚函数
        return en.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        check();
        Object o1 = methodProxy.invokeSuper(o, objects);
        log();
        return o1;
    }

    public  void  check(){
        System.out.println("权限检查");
    }

    public  void  log(){
        System.out.println("日志记录");
    }
}

