package cn.zhen77.test;

import cn.zhen77.mapper.EmpDeptMapper;
import cn.zhen77.pojo.EmpDept;
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

}
