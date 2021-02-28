package cn.zhen77.aop.springxml;

/**
 * @author : zhen77
 * @date: 2021/1/31 - 01 - 31 - 15:17
 * @Description: cn.zhen77.aop.springxml
 * @version: 1.0
 */
public class Advice {
    public void check(){
        System.out.println("权限检查");
    }
    public void log(){
        System.out.println("日志记录");
    }
}
