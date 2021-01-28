package cn.zhen77.test;

import cn.zhen77.mapper.ItemsMapper;
import cn.zhen77.pojo.Items;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author : zhen77
 * @date: 2021/1/28 - 01 - 28 - 16:26
 * @Description: cn.zhen77.test
 * @version: 1.0
 */
public class MyBatisCache {
    private SqlSessionFactory factory;

    @Before
    public void init() throws Exception{
        InputStream stream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory=builder.build(stream);
    }
    @Test
    public void test1() throws Exception {
        SqlSession session = factory.openSession();
        ItemsMapper mapper = session.getMapper(ItemsMapper.class);
        //默认myBatis自带1级缓存    ->  两条一模一样的语句只需查找一次
        Items item1 = mapper.selectByid(2);
        //commit 和 close 都会清理掉缓存
        session.commit();
        Items item2 = mapper.selectByid(2);
        System.out.println(item1.getName()+"__"+item1.getPrice());
        System.out.println(item2.getName()+"__"+item2.getPrice());
        session.close();
    }
}
