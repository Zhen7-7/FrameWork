package cn.zhen77.mapper;

import cn.zhen77.pojo.Users;

import java.util.List;

public interface UsersMapper {
    //根据用户编号查看用户下,所有的订单,订单详情,商品信息
    List<Users> selectAll(int uid) throws Exception;


}