package cn.zhen77.service.impl;

import cn.zhen77.mapper.DeptMapper;
import cn.zhen77.pojo.Dept;
import cn.zhen77.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/6 - 02 - 06 - 22:29
 * @Description: cn.zhen77.service.impl
 * @version: 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public void setDeptMapper(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    @Override
    /*@Transactional 当前是查询功能不需要，如果是增删改功能需要加声明式事务，方法如果出错就会进行回滚了。而且单表的增删改一般都不用放，放的都是多表的增删改功能的。*/
    public List<Dept> selectAll() {
        return deptMapper.selectAll();
    }
}

