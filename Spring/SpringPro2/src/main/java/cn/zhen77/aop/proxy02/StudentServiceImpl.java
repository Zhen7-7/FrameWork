package cn.zhen77.aop.proxy02;

/**
 * @author : zhen77
 * @date: 2021/1/31 - 01 - 31 - 9:33
 * @Description: cn.zhen77.aop.proxy02
 * @version: 1.0
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public void add() throws Exception {
        System.out.println("学生对象添加成功");
    }
}
