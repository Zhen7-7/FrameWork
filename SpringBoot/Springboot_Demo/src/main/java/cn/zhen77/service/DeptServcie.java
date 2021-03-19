package cn.zhen77.service;

import cn.zhen77.mapper.DeptMapper;
import cn.zhen77.pojo.Dept;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/15 - 03 - 15 - 23:08
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
public interface DeptServcie {
    public List<Dept> find();
    public List<Dept> selectBycon(Dept dept);
}
