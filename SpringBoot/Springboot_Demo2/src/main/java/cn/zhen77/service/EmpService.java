package cn.zhen77.service;

import cn.zhen77.mapper.EmpMapper;
import cn.zhen77.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/18 - 03 - 18 - 15:24
 * @Description: cn.zhen77.service
 * @version: 1.0
 */

public interface EmpService {
    public List<Emp> selectAllEmp ();

    public int insertEmp(Emp emp);

    public Emp selectByOneemp(int id);

//    public int deleteEmp(int id);
}
