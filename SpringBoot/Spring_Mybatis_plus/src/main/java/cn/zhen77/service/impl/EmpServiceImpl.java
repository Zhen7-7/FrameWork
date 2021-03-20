package cn.zhen77.service.impl;

import cn.zhen77.mapper.EmpMapper;
import cn.zhen77.pojo.Emp;
import cn.zhen77.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/20 - 03 - 20 - 19:47
 * @Description: cn.zhen77.service.impl
 * @version: 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> selectAll() {
        return empMapper.selectList(null);
    }
}
