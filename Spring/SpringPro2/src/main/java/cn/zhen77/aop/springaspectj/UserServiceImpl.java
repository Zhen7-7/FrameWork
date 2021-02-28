package cn.zhen77.aop.springaspectj;

import org.springframework.stereotype.Service;

/**
 * @author : zhen77
 * @date: 2021/1/31 - 01 - 31 - 15:20
 * @Description: cn.zhen77.aop.springxml
 * @version: 1.0
 */


@Service
public class UserServiceImpl implements UserService {
    @Override
    public void add() throws Exception {
        System.out.println("添加User成功");
    }

    @Override
    public void delete() throws Exception {
        System.out.println("删除User成功");
    }
}
