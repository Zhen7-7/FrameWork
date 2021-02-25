package cn.zhen77.service;

import cn.zhen77.pojo.Dept;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/2/25 - 02 - 25 - 13:52
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
public interface DeptService {
    public int addDept(Dept dept) throws Exception;
    public int delDept(int id) throws Exception;
    public List<Dept> findAll() throws Exception;

}
