package cn.zhen77.mapper;

import cn.zhen77.pojo.Dept;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/16 - 03 - 16 - 10:25
 * @Description: cn.zhen77.mapper
 * @version: 1.0
 */
public interface DeptMapper {
    public List<Dept> selectAll();

    public int insert(Dept dept);
}
