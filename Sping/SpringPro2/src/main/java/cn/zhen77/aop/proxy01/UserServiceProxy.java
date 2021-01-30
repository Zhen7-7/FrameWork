package cn.zhen77.aop.proxy01;

/**
 * @author : zhen77
 * @date: 2021/1/30 - 01 - 30 - 17:37
 * @Description: cn.zhen77.aop.proxy01
 * @version: 1.0
 */
public class UserServiceProxy implements UserService {
    //要代理谁? userServiceImpl这个实现类
    private UserService userService = new UserServiceImpl();

    @Override
    public void add() throws Exception {
        check();
        userService.add();
        log();
    }

    @Override
    public void delet() throws Exception {
        check();
        userService.delet();

    }
    public void check(){
        System.out.println("权限检查");
    }

    public void log(){
        System.out.println("日志记录");
    }
}
