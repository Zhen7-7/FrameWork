package cn.zhen77;

import cn.zhen77.pojo.Dept;
import cn.zhen77.service.DeptService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/25 - 02 - 25 - 14:10
 * @Description: cn.zhen77
 * @version: 1.0
 */
public class Test {
    @org.junit.Test
    public void test1() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = (DeptService) app.getBean("deptServiceImpl");
        Dept dept = new Dept();

        dept.setDname("可爱不");
        dept.setLoc("天津");

        deptService.addDept(dept);
        List<Dept> list = deptService.findAll();
        for (Dept d :
                list) {
            System.out.println(d.toString());
        }
        int i = deptService.delDept(42);
        System.out.println(i==1?"成功":"失败");
    }
}
