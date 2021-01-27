package cn.zhen77.test;

import cn.zhen77.mapper.DeptMapper;
import cn.zhen77.mapper.EmpDeptMapper;
import cn.zhen77.mapper.EmpMapper;
import cn.zhen77.mapper.UsersMapper;
import cn.zhen77.pojo.*;
import com.mysql.cj.Session;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/1/26 - 01 - 26 - 16:52
 * @Description: cn.zhen77
 * @version: 1.0
 */
public class MyBatisTest {
    private SqlSessionFactory factory;
    @Before
    public void init() throws IOException {
        InputStream stream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(stream);
    }
    @Test
    public void test1() throws Exception {
        SqlSession session = factory.openSession();
        EmpDeptMapper mapper = session.getMapper(EmpDeptMapper.class);
        List<EmpDept> list = mapper.selectAll();

        session.close();
        for (EmpDept e: list) {
            System.out.println(e.toString());
        }

    }
    @Test
    public void test2() throws Exception {
        SqlSession session = factory.openSession();
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        List<Emp> emps = empMapper.selectAllEmp();

        session.close();
        for ( Emp e: emps) {
            System.out.println(e.toString());

        }

    }

    @Test
    public void test3() throws Exception{
        SqlSession session = factory.openSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Dept dept = mapper.findDeptById(10);

        System.out.println("部门信息："+dept.getLoc()+";"+dept.getDname()+";"+dept.getLoc());
        System.out.println("部门里，所有员工的信息：");
        if (dept.getEmps()!=null){
            for(Emp e:dept.getEmps()){
                System.out.println(e.getEname()+";"+e.getEmpno()+";"+e.getSal());
            }
        }

        session.close();

    }
    @Test
    public void test5() throws Exception {
        SqlSession session = factory.openSession();
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        List<Users> list = mapper.selectAll(1001);

        session.close();
        for(Users u:list){
            System.out.println("用户信息："+u.getUname()+";"+u.getUid()+"\n");
            for(Orders o:u.getOrders()){
                System.out.println("用户所下的订单信息："+o.getOid()+";"+o.getOrderid()+"\n");
                for(OrderDetail od:o.getOrderDetail()){
                    System.out.println("订单详情："+od.getItemnum()+";"+od.getItems().getName()+";"+od.getItems().getDetail());

                }
            }
        }

    }

}
