package cn.zhen77.service.impl;

import cn.zhen77.mapper.DeptMapper;
import cn.zhen77.pojo.Dept;
import cn.zhen77.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/16 - 03 - 16 - 10:30
 * @Description: cn.zhen77.service.impl
 * @version: 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private  DeptMapper deptMapper;

    @Override
    public List<Dept> find() {
        return deptMapper.selectAll();
    }
}
