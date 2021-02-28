package cn.zhen77.mapper;

import cn.zhen77.pojo.Dept;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/1 - 02 - 01 - 11:05
 * @Description: cn.zhen77.mapper
 * @version: 1.0
 */
//mapper接口无注解
public interface DeptMapper {


    int insertDept(Dept record);

    int deleteDept(int deptno);

    List<Dept> selectAll();
}
