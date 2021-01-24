package cn.zhen77.dao;

import cn.zhen77.pojo.Dept;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/1/24 - 01 - 24 - 12:50
 * @Description: cn.zhen77.dao
 * @version: 1.0
 */
public interface DeptDao {
    //查询部门讯息
    List<Dept> selectAll() throws Exception;

    //根据主键查到单个部门信息
    Dept selectOneById() throws Exception;

    int insertDept(Dept dept) throws Exception;

    int updateDept(Dept dept) throws Exception;

    int delDept(int id) throws Exception;


}
