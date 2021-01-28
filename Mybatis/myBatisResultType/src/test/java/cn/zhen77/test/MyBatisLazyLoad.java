package cn.zhen77.test;

import cn.zhen77.mapper.ItemsMapper;
import cn.zhen77.mapper.OrderDetailMapper;
import cn.zhen77.pojo.OrderDetail;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author : zhen77
 * @date: 2021/1/28 - 01 - 28 - 13:56
 * @Description: cn.zhen77.test
 * @version: 1.0
 */
public class MyBatisLazyLoad {
    private SqlSessionFactory factory;
    @Before
    public void init() throws IOException {
        InputStream stream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory=builder.build(stream);
    }
    @Test
    public void test() throws Exception {
        SqlSession session = factory.openSession();
        OrderDetailMapper mapper = session.getMapper(OrderDetailMapper.class);
        OrderDetail orderDetail = mapper.selectLazyLoadById(6);
        session.close();
        System.out.println(orderDetail.getOdid());
        System.out.println(orderDetail.getItems().getName());
    }
}
