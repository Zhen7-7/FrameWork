package cn.zhen77.mapper;

import cn.zhen77.pojo.Emp;

import java.util.List;


public interface EmpMapper {
    List<Emp> selectEmpBySalename(Emp emp) throws  Exception;

    List<Emp> seletctEmpByinfo(Emp emp) throws Exception;

    int insertEmp(Emp emp) throws Exception;

    int updateEmp(Emp emp) throws Exception;

    List<Emp> selectEmpByList (List<Integer> list) throws Exception;

    List<Emp> selectEmpByArray (int[] array) throws Exception;


}