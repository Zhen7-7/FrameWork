package cn.zhen77.mapper;

import cn.zhen77.pojo.Dpet;

public interface DpetMapper {
    int deleteByPrimaryKey(Integer deptno);

    int insert(Dpet record);

    int insertSelective(Dpet record);

    Dpet selectByPrimaryKey(Integer deptno);

    int updateByPrimaryKeySelective(Dpet record);

    int updateByPrimaryKey(Dpet record);
}