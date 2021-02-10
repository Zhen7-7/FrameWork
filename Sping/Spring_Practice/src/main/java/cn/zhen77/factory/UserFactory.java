package cn.zhen77.factory;

import cn.zhen77.pojo.User;

/**
 * @author : zhen77
 * @date: 2021/2/10 - 02 - 10 - 12:06
 * @Description: cn.zhen77.factory
 * @version: 1.0
 */
public class UserFactory {
    public User getUser(){
        User user = new User(2, "momo", 17);
        return user;
    }
    public static User getstaticInstance(){
        return new User(3,"static",18);
    }
    public User getUser1(User user){
        return user;
    }
    public static User getStaticInstance1(User user){
        return user;
    }
}
