package cn.zhen77.aop.proxy03;

/**
 * @author : zhen77
 * @date: 2021/1/31 - 01 - 31 - 9:49
 * @Description: cn.zhen77.aop.proxy03
 * @version: 1.0
 */
public class UserSub extends UserSuper {
    @Override
    public void add() {
        System.out.println("User对象添加成功");

    }
}
