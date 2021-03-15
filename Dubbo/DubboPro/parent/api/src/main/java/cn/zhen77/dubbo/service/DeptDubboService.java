package cn.zhen77.dubbo.service;

import cn.zhen77.pojo.Dept;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/15 - 03 - 15 - 15:58
 * @Description: cn.zhen77.dubbo.service
 * @version: 1.0
 */
public interface DeptDubboService {

    public List<Dept> findAllDept();

}
