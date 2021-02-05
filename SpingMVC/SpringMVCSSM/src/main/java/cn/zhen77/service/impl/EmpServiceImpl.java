package cn.zhen77.service.impl;

import cn.zhen77.mapper.EmpMapper;
import cn.zhen77.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/5 - 02 - 05 - 18:01
 * @Description: cn.zhen77.service.impl
 * @version: 1.0
 */
@Service("empService")
public class EmpServiceImpl implements EmpService{

    @Autowired
    EmpMapper empMapper;
    public List<Emp> findAll() {
        return empMapper.selectAllEmpAndDept();
    }
}
