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
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/1/24 - 01 - 24 - 16:17
 * @Description: cn.zhen77.test
 * @version: 1.0
 */
public class MyBatisTest {
    private SqlSessionFactory factory;
    @Before
    public void init() throws Exception{
        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(stream);
    }
    @Test
    public void test1() throws Exception {
        SqlSession session = factory.openSession();
        DeptMapper deptDapper = session.getMapper(DeptMapper.class);
        List<Dept> depts = deptDapper.selectAll();
        for(Dept d : depts){
            System.out.println(d.getDeptno()+"-"+d.getDname()+"-"+d.getLoc());
        }
        session.close();
    }

    @Test
    public void test2() throws Exception{
        SqlSession session = factory.openSession();
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setSal(3000.0);
//        emp.setEname("张三");
        List<Emp> list = empMapper.selectEmpBySalename(emp);
        session.close();
        for (Emp e : list){
            System.out.println(e.getDeptno()+":"+e.getEname()+":"+e.getSal());
        }
    }
    @Test
    public void Test3() throws Exception{
        SqlSession session = factory.openSession();
        EmpMapper EmpMapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setSal(9000.0);
        emp.setDeptno(10);


        List<Emp> list = EmpMapper.seletctEmpByinfo(emp);
        for (Emp e:list){
            System.out.println(e.getDeptno()+":"+e.getEname()+":"+e.getSal());
        }

        session.close();
    }
    @Test
    public void test4() throws Exception{
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


        if (i==1){
            System.out.println("成功");

        }else{
            System.out.println("失败");

        }


    }













}
