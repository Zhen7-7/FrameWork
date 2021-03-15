package cn.zhen77.service.impl;

import cn.zhen77.dubbo.service.DeptDubboService;
import cn.zhen77.pojo.Dept;
import cn.zhen77.service.DeptService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/15 - 03 - 15 - 16:08
 * @Description: cn.zhen77.service.impl
 * @version: 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Reference
    private DeptDubboService deptDubboService;

    @Override
    public List<Dept> findAll() {
        return deptDubboService.findAllDept();
    }
}
