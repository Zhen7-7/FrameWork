package cn.zhen77.service.impl;

import cn.zhen77.mapper.DeptMapper;
import cn.zhen77.pojo.Dept;
import cn.zhen77.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/1 - 02 - 01 - 12:21
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
//service实现类需要@Service

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class DeptServiceImpl implements DeptService {
    //依赖于mapper层 所以把依赖以属性的方式注入
    //通过类型来自动注入


    @Autowired
    private DeptMapper deptMapper;

    public DeptMapper getDeptMapper() {
        return deptMapper;
    }

    public void setDeptMapper(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    public int addDept(Dept dept) throws Exception {
        return deptMapper.insertDept(dept);
    }

    public int removeDept(int id) throws Exception {
        return deptMapper.deleteDept(id);
    }

    public List<Dept> findAll() throws Exception {
        return deptMapper.selectAll();
    }

    public int addRemovefindDept(Dept dept, int id) throws Exception {
        int i = deptMapper.insertDept(dept);
        i=i+deptMapper.deleteDept(id);
        return i;
    }
}