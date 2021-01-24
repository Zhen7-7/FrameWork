package cn.zhen77.dao.impl;

import cn.zhen77.dao.DeptDao;
import cn.zhen77.pojo.Dept;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/1/24 - 01 - 24 - 13:12
 * @Description: cn.zhen77.dao.impl
 * @version: 1.0
 */
public class DeptDaoImpl implements DeptDao {
    private SqlSessionFactory factory;

    public DeptDaoImpl(SqlSessionFactory factory){
        this.factory=factory;
    }

    @Override
    public List<Dept> selectAll() throws Exception {
        List<Dept> list = null;
        SqlSession session = factory.openSession();
        list = session.selectList("selectAllDept");

        session.close();
        return list;
    }

    @Override
    public Dept selectOneById() throws Exception {
        Dept dept = new Dept();
        SqlSession session = factory.openSession();
        dept = session.selectOne("selectDeptByDeptno");

        session.close();
        return dept;

    }

    @Override
    public int insertDept(Dept dept) throws Exception {
        SqlSession session = factory.openSession();

        int i = session.insert("insertDept", dept);

        session.commit();
        session.close();
        return i;
    }

    @Override
    public int updateDept(Dept dept) throws Exception {
        SqlSession session = factory.openSession();
        int i = session.update("updateDept", dept);

        session.commit();
        session.close();
        return i;
    }

    @Override
    public int delDept(int id) throws Exception {
        SqlSession session = factory.openSession();
        int i = session.delete("delDept", id);

        session.commit();
        session.close();
        return i;
    }
}
