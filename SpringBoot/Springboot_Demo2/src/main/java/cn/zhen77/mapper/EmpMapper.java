package cn.zhen77.mapper;

import cn.zhen77.pojo.Emp;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/3/18 - 03 - 18 - 15:14
 * @Description: cn.zhen77.mapper
 * @version: 1.0
 */
public interface EmpMapper {
    public List<Emp> selectAll ();

    public int insert(Emp emp);

    public Emp selectByOne(int id);

    public int delete(int id);

}
