package cn.zhen77.test;

import cn.zhen77.mapper.DeptMapper;
import cn.zhen77.pojo.Dept;
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
}
