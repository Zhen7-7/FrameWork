package cn.zhen77.service;

import cn.zhen77.pojo.Dept;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/16 - 03 - 16 - 10:29
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
public interface DeptService {
    public List<Dept> find();
    public int insert(Dept dept);
}
