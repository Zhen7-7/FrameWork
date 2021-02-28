package cn.zhen77.aop.proxy01;

/**
 * @author : zhen77
 * @date: 2021/1/30 - 01 - 30 - 17:12
 * @Description: cn.zhen77.cn.zhen77.aop.proxy01
 * @version: 1.0
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() throws Exception {
//        check();//在添加之前进行权限检查
        System.out.println("添加User成功");
//        log();//在添加之后进行日志记录
    }

    @Override
    public void delet() throws Exception {
//        check();
        System.out.println("删除User");
//        log();
    }


}
