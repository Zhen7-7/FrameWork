package cn.zhen77.mapper;

import cn.zhen77.pojo.Items;

public interface ItemsMapper {
    int deleteByPrimaryKey(Integer iid);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);
}