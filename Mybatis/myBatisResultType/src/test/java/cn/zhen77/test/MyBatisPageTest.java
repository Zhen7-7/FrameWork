package cn.zhen77.test;

import cn.zhen77.mapper.UsersMapper;
import cn.zhen77.pojo.Users;
import cn.zhen77.util.Page;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
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
 * @date: 2021/1/27 - 01 - 27 - 18:12
 * @Description: cn.zhen77.test
 * @version: 1.0
 */
public class MyBatisPageTest {
    private SqlSessionFactory factory;
    @Before
    public void init() throws IOException {
        InputStream stream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(stream);

    }
    @Test
    public void test1() throws Exception{
        SqlSession session = factory.openSession();
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        Page page= new Page();
        page.setDatacount(mapper.selectCount());
        page.setShowdata(2);
        page.setPageindex(1);
        page.getPagecount();
        page.setList(mapper.selectUserByPage(page));
        List<Users> list = page.getList();
        System.out.println(
                "当前是第"
                +page.getPageindex()+"页;一共有"
                +page.getPagecount()+"页"
        );
        for (Users u :
                list) {
            System.out.println(u.getUid()+"_"+u.getUname()+"_"+u.getAddress());
        }
        session.close();

    }
    @Test
    public void test2() throws Exception{
        SqlSession session = factory.openSession();
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        RowBounds rb = new RowBounds(0, 2);
        List<Users> list = mapper.findall(rb);
        for (Users u :
                list) {
            System.out.println(u.getUid()+"_"+u.getUname()+"_"+u.getAddress());
        }



        session.close();
    }

}
