package cn.zhen77.dubbo.service.impl;

import cn.zhen77.dubbo.service.DeptDubboService;
import cn.zhen77.mapper.DeptMapper;
import cn.zhen77.pojo.Dept;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/15 - 03 - 15 - 16:05
 * @Description: cn.zhen77.dubbo.service.impl
 * @version: 1.0
 */
@Service
public class DeptDubboServiceImp implements DeptDubboService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAllDept() {
        return deptMapper.findAll();
    }
}
