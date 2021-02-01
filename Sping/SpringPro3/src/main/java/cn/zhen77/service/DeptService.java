package cn.zhen77.service;

import cn.zhen77.pojo.Dept;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/1 - 02 - 01 - 12:20
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
public interface DeptService {

    public int addDept(Dept dept) throws Exception;

    public int removeDept(int id) throws Exception;

    public List<Dept> findAll() throws Exception;
}
