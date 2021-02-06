package cn.zhen77.mapper;

import cn.zhen77.pojo.Dept;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/6 - 02 - 06 - 21:44
 * @Description: cn.zhen77.mapper
 * @version: 1.0
 */
public interface DeptMapper {
    List<Dept> selectAll();
}
