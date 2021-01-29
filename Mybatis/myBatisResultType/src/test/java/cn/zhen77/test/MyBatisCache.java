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
    @Test
    public void test2() throws Exception{
        SqlSession session = factory.openSession();
        SqlSession session1 = factory.openSession();
        ItemsMapper mapper = session.getMapper(ItemsMapper.class);
        ItemsMapper mapper1 = session1.getMapper(ItemsMapper.class);
        Items item1 = mapper.selectByid(2);
        System.out.println(item1.getName()+"__"+item1.getPrice());
        session.close();
        Items item2 = mapper1.selectByid(2);
        System.out.println(item2.getName()+"__"+item2.getPrice());
        session1.close();
    }
    @Test
    public void test3() throws Exception{
        SqlSession session = factory.openSession();
        SqlSession session1 = factory.openSession();
        ItemsMapper mapper = session.getMapper(ItemsMapper.class);
        ItemsMapper mapper1 = session1.getMapper(ItemsMapper.class);
        Items item1 = mapper.selectByid(2);
        System.out.println(item1.getName()+"__"+item1.getPrice());


        Items items = new Items();
        items.setIid(5);
        items.setName("玩具娃娃");
        items.setDetail("非常逼真");
        items.setPrice(996.0);
        int i = mapper.insertItems(items);
        session.commit();
        session.close();
        Items item2 = mapper1.selectByid(2);
        System.out.println(item2.getName()+"__"+item2.getPrice());
        session1.close();
    }

    @Test
    public void testEhcache() throws Exception {
        SqlSession session1=factory.openSession();
        SqlSession session2=factory.openSession();

        ItemsMapper mapper1 = session1.getMapper(ItemsMapper.class);
        Items item1 = mapper1.selectByid(3);//持久化----缓存
        System.out.println(item1.getName()+"__"+item1.getPrice());
        session1.close();

        ItemsMapper mapper2 = session2.getMapper(ItemsMapper.class);
        Items item2 = mapper2.selectByid(3);//持久化----缓存
        System.out.println(item2.getName()+"__"+item2.getPrice());
        session2.close();
    }
}
