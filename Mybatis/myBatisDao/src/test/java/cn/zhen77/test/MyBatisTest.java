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
	// 创建sqlSessionFactory
    private SqlSessionFactory factory;
	// 此方法是在执行testFindUserById之前执行
    @Before
    public void init() throws IOException {
		// 得到配置文件流
        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");// mybatis配置文件
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		 // 创建会话工厂，传入mybatis的配置文件信息
        factory = builder.build(stream);
    }

    @Test
    public void findAll() throws Exception {
		// 创建UserDao的对象
        DeptDaoImpl deptDaoImpl = new DeptDaoImpl(factory);
		// 调用UserDao的方法
        List<Dept> list = deptDaoImpl.selectAll();
        for(Dept d : list){
            System.out.println(d.getDeptno()+"-"+d.getDname()+"-"+d.getLoc());
        }
    }
}
