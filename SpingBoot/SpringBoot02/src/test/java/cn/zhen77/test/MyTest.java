package cn.zhen77.test;

import cn.SSMApplication;
import cn.zhen77.pojo.Dept;
import cn.zhen77.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/9 - 02 - 09 - 9:41
 * @Description: cn.zhen77.test
 * @version: 1.0
 */
@SpringBootTest(classes = SSMApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {
    @Autowired
    //测试什么方法像往常一下需要注入;
    private DeptService deptService;

    public DeptService getDeptService() {
        return deptService;
    }

    public void setDeptService(DeptService deptService) {
        this.deptService = deptService;
    }
    @Test
    public void test1(){
        List<Dept> list = deptService.selectAll();
        for (Dept d :list){
            System.out.println(d.toString());
        }

    }
}
