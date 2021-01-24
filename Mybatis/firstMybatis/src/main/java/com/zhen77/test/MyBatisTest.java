package com.zhen77.test;

import com.zhen77.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author : Zhen77
 * @date: 2021/1/22 - 01 - 22 - 19:37
 * @Description: com.zhen77.test
 * @version: 1.0
 */
public class MyBatisTest {

    @Test
    public void insert() throws IOException {

        //1.加载配置文件
        InputStream resource= Resources.getResourceAsStream("SqlMapConfig.xml");

        //2.获得session对象，建立会话连接
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(resource,"development");
        SqlSession session=factory.openSession();

        //3.调用session方法，获得结果信息
        List<Dept> list=session.selectList("selectAllDept");
        for(Dept d:list){
            System.out.println(d.getDeptno()+";"+d.getDname()+";"+d.getLoc());
        }
        //4.关闭session对象资源
        session.close();

    }

    private SqlSessionFactory factory;
    @Before
    public void before() throws IOException{
        //1.加载配置文件
        InputStream resource= Resources.getResourceAsStream("SqlMapConfig.xml");

        //2.获得session对象，建立会话连接
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        factory=builder.build(resource,"development");
    }
    @Test
    public void findById(){
        SqlSession session = factory.openSession();
        Dept dept = session.selectOne("selectDeptById", 10);
        System.out.println(dept.getDeptno() + "_" + dept.getDname() + "_" + dept.getLoc());
        session.close();
    }
    @Test
    public void addDept(){
        SqlSession session = factory.openSession();
        Dept dept = new Dept(10,"运维部","上海");
        int i = session.insert("insertDept",dept);
        //注意:   session进行手动提交
        session.commit();
        session.close();
        System.out.println(i==1?"添加成功":"添加失败");
    }

    @Test
    public void insertUseGeneratedKeys(){
        SqlSession session = factory.openSession();
        Dept dept = new Dept();
        dept.setDname("快递部");
        dept.setLoc("哈尔滨");
        int i = session.insert("insertUseGeneratedKeys", dept);

        session.commit();
        session.close();
        System.out.println(i==1?"添加成功":"添加失败");
    }

    @Test
    public void updateDeptById(){
        SqlSession session = factory.openSession();
        Dept dept = new Dept();
        dept.setDeptno(10);
        dept.setLoc("克山县");

        int i = session.update("updateDeptById", dept);

        session.commit();
        session.close();
        System.out.println(i==1?"修改成功":"修改失败");
    }

    @Test
    public void delDeptById(){
        SqlSession session = factory.openSession();
        Dept dept = new Dept();
        dept.setDeptno(10);
        int i = session.delete("delDeptById", dept);
//        int i = session.delete("delDeptById", 10);

        session.commit();
        session.close();
        System.out.println(i==1?"删除成功":"删除失败");
    }


}
