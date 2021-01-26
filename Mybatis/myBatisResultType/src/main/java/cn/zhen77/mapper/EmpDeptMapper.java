package cn.zhen77.mapper;

import cn.zhen77.pojo.EmpDept;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/1/26 - 01 - 26 - 16:45
 * @Description: cn.zhen77.mapper
 * @version: 1.0
 */
public interface EmpDeptMapper {
    List<EmpDept> selectAll() throws Exception;

}
