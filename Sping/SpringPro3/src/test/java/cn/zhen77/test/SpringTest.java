package cn.zhen77.test;

import cn.zhen77.pojo.Dept;
import cn.zhen77.service.DeptService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/1 - 02 - 01 - 12:36
 * @Description: cn.zhen77.test
 * @version: 1.0
 */
public class SpringTest {


    @Test
    public void test1() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = (DeptService) app.getBean("deptServiceImpl");
        List<Dept> list = deptService.findAll();
        for (Dept d:list){
            System.out.println(d.getDeptno()+";"+d.getDname()+";"+d.getLoc());
        }

    }
    @Test
    public void Test2() throws Exception{
        ApplicationContext app =  new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = (DeptService) app.getBean("deptServiceImpl");
        Dept dept = new Dept();
        dept.setDname("吃饭部");
        dept.setLoc("地球");
        dept.setDeptno(22);
        int i = deptService.addDept(dept);
        System.out.println(i==1?"success":"false");
    }
    @Test
    public void test3() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = (DeptService) app.getBean("deptServiceImpl");
        int i = deptService.removeDept(22);
        System.out.println(i==1?"success":"false");
    }
}



