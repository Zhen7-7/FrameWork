package cn.zhen77.mapper;

import cn.zhen77.pojo.Dept;

import java.util.List;

public interface DeptMapper {
    public List<Dept> selectAll();
    public List<Dept> getDeptByCondition(Dept dept);
}