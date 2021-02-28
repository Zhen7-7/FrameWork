package cn.zhen77.mapper;

import cn.zhen77.pojo.Emp;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/5 - 02 - 05 - 19:46
 * @Description: cn.zhen77.mapper
 * @version: 1.0
 */
public interface EmpMapper {
    public List<Emp> selectAllEmpAndDept();

}
