package cn.zhen77.factorty;

import cn.zhen77.pojo.User;

/**
 * @author : zhen77
 * @date: 2021/1/29 - 01 - 29 - 16:05
 * @Description: cn.zhen77.factorty
 * @version: 1.0
 */
public class UsersFactory {
    //使用实例工厂类+无参
    /*
    public User getInstance(){
        return new User(123,"末末",15,"女");
    }*/

    //使用静态的工厂类+无参
    /*public static User getInstance(){
        return new User(123,"末末",15,"女");
    }*/

    //使用实例工厂类+有参
    /*
    public User getInstance(User user){
        return user;
    }
     */
    //使用静态的工厂类+有参
    public static User getInstance(User user){
        return user;
    }
}
