package cn.zhen77.mapper;

import cn.zhen77.pojo.Users;

public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);
}