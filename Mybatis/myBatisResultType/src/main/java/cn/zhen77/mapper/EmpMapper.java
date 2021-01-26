package cn.zhen77.mapper;

import cn.zhen77.pojo.Emp;

import java.util.List;

public interface EmpMapper {
//第2步 以员工角度出发去查找部门信息就在员工的mapper中加入方法
    List<Emp> selectAllEmp() throws Exception;
}