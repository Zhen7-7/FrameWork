package com.msb.mapper;

import com.msb.pojo.Emp;

public interface EmpMapper {
    int insert(Emp record);

    int insertSelective(Emp record);
}