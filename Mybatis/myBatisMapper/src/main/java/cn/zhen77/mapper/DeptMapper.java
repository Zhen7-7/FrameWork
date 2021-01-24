package cn.zhen77.mapper;

import cn.zhen77.pojo.Dept;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/1/24 - 01 - 24 - 16:05
 * @Description: cn.zhen77.mapper
 * @version: 1.0
 */
public interface DeptMapper {



        //查询部门讯息
        List<Dept> selectAll() throws Exception;

        //根据主键查到单个部门信息
        Dept selectOneById(int id) throws Exception;

        int insertDept(Dept dept) throws Exception;

        int updateDept(Dept dept) throws Exception;

        int delDept(int id) throws Exception;




}
