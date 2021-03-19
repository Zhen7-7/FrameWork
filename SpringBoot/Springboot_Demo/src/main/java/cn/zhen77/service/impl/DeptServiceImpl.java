package cn.zhen77.service.impl;

import cn.zhen77.mapper.DeptMapper;
import cn.zhen77.pojo.Dept;
import cn.zhen77.service.DeptServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/15 - 03 - 15 - 23:09
 * @Description: cn.zhen77.service.impl
 * @version: 1.0
 */
@Service
public class DeptServiceImpl implements DeptServcie {

    @Autowired
    private  DeptMapper deptMapper;

    public void setDeptMapper(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    @Override
    public List<Dept> selectBycon(Dept dept) {
        return deptMapper.getDeptByCondition(dept);
    }

    @Override
    public List<Dept> find() {
        return deptMapper.selectAll();
    }
}
