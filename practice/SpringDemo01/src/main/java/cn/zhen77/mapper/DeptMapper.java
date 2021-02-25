package cn.zhen77.mapper;

import cn.zhen77.pojo.Dept;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/25 - 02 - 25 - 13:47
 * @Description: cn.zhen77.mapper
 * @version: 1.0
 */
public interface DeptMapper {


    int insertDept(Dept dept);//插入

    int deleteDept(int deptno);//删除

    List<Dept> selectAll();
}
