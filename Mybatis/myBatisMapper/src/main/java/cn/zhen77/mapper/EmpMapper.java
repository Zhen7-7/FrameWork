package cn.zhen77.mapper;

import cn.zhen77.pojo.Emp;

import java.util.List;
import java.util.Map;
import java.util.Objects;


public interface EmpMapper {
    List<Emp> selectEmpBySalename(Emp emp) throws  Exception;

    List<Emp> seletctEmpByinfo(Emp emp) throws Exception;

    int insertEmp(Emp emp) throws Exception;

    int updateEmp(Emp emp) throws Exception;

    List<Emp> selectEmpByList (List<Integer> list) throws Exception;

    List<Emp> selectEmpByArray (int[] array) throws Exception;

    List<Emp> selectEmpByMap (Map<String,List<Integer>> map) throws  Exception;

    List<Emp> selectEmpByMapInfo (Map<String, Object> map) throws Exception;



}