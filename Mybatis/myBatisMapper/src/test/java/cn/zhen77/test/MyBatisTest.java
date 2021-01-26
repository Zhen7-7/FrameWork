package cn.zhen77.test;

import cn.zhen77.mapper.DeptMapper;
import cn.zhen77.mapper.EmpMapper;
import cn.zhen77.pojo.Dept;
import cn.zhen77.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : zhen77
 * @date: 2021/1/24 - 01 - 24 - 16:17
 * @Description: cn.zhen77.test
 * @version: 1.0
 */
public class MyBatisTest {
    private SqlSessionFactory factory;

    @Before
    public void init() throws Exception {
        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(stream);
    }

    @Test
    public void test1() throws Exception {
        SqlSession session = factory.openSession();
        DeptMapper deptDapper = session.getMapper(DeptMapper.class);
        List<Dept> depts = deptDapper.selectAll();
        for (Dept d : depts) {
            System.out.println(d.getDeptno() + "-" + d.getDname() + "-" + d.getLoc());
        }
        session.close();
    }

    @Test
    public void test2() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setSal(3000.0);
//        emp.setEname("张三");
        List<Emp> list = empMapper.selectEmpBySalename(emp);
        session.close();
        for (Emp e : list) {
            System.out.println(e.getDeptno() + ":" + e.getEname() + ":" + e.getSal());
        }
    }

    @Test
    public void Test3() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper EmpMapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setSal(9000.0);
        emp.setDeptno(10);


        List<Emp> list = EmpMapper.seletctEmpByinfo(emp);
        for (Emp e : list) {
            System.out.println(e.getDeptno() + ":" + e.getEname() + ":" + e.getSal());
        }

        session.close();
    }

    @Test
    public void test4() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEname("孙朕");
        emp.setSal(10000.0);
        emp.setComm(500.0);
        emp.setEmpno(10);


        int i = empMapper.insertEmp(emp);
        session.commit();
        session.close();


        if (i == 1) {
            System.out.println("成功");

        } else {
            System.out.println("失败");

        }
    }

    @Test
    public void test5() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEmpno(1234);
        emp.setSal(7000.0);
        emp.setEname("三歌");


        int i = mapper.updateEmp(emp);
        session.commit();
        session.close();
        System.out.println(i == 1 ? "成功" : "失败");
    }

    @Test
    public void testForeach1() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1234);
        List<Emp> emps = mapper.selectEmpByList(list);
        session.close();
        for (Emp e :
                emps) {
            System.out.println(e.getDeptno() + ":" + e.getEname() + ":" + e.getSal());
        }

    }

    @Test
    public void testForeach2() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        int[] array = {10, 1234, 1616};


        List<Emp> emps = mapper.selectEmpByArray(array);
        session.close();
        for (Emp e :
                emps) {
            System.out.println(e.getDeptno() + ":" + e.getEname() + ":" + e.getSal());
        }

    }

    @Test
    public void testForeach3() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(1234);
        list.add(1616);

        map.put("empnos", list);
        List<Emp> emps = mapper.selectEmpByMap(map);
        session.close();
        for (Emp e :
                emps) {
            System.out.println(e.getDeptno() + ":" + e.getEname() + ":" + e.getSal());
        }
    }
    @Test
    public void testForeach4() throws Exception{
        SqlSession session = factory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("deptnokey",10);
        map.put("enameKey","三");
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(100);
            list.add(1234);
            list.add(1616);

        map.put("empnoKey",list);
        List<Emp> emps = mapper.selectEmpByMapInfo(map);
        session.close();
        for (Emp e :
                emps) {
            System.out.println(e.getDeptno() + ":" + e.getEname() + ":" + e.getSal());
        }
    }
}
