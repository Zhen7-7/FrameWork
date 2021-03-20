package cn.zhen77.service;

import cn.zhen77.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/20 - 03 - 20 - 17:47
 * @Description: cn.zhen77.service
 * @version: 1.0
 */
public interface EmpService {
    public List<Emp> selectAll();
}
