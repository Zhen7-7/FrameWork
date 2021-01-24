package cn.zhen77.test;

import cn.zhen77.dao.impl.DeptDaoImpl;
import cn.zhen77.pojo.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/1/24 - 01 - 24 - 13:32
 * @Description: cn.zhen77.test
 * @version: 1.0
 */
public class MyBatisTest {
    private SqlSessionFactory factory;

    @Before
    public void init() throws IOException {
        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(stream);
    }

    @Test
    public void findAll() throws Exception {
        DeptDaoImpl deptDaoImpl = new DeptDaoImpl(factory);
        List<Dept> list = deptDaoImpl.selectAll();
        for(Dept d : list){
            System.out.println(d.getDeptno()+"-"+d.getDname()+"-"+d.getLoc());
        }
    }
}
