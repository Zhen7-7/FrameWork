package cn.zhen77.service.Impl;

import cn.zhen77.mapper.DeptMapper;
import cn.zhen77.pojo.Dept;
import cn.zhen77.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/25 - 02 - 25 - 13:54
 * @Description: cn.zhen77.service.Impl
 * @version: 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    public DeptMapper getDeptMapper() {
        return deptMapper;
    }

    public void setDeptMapper(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    @Override
    public int addDept(Dept dept) throws Exception {
        return deptMapper.insertDept(dept);
    }

    @Override
    public int delDept(int id) throws Exception {
        return deptMapper.deleteDept(id);
    }

    @Override
    public List<Dept> findAll() throws Exception {
       return deptMapper.selectAll();
    }
}
