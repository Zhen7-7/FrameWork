package cn.zhen77.mapper;

import cn.zhen77.pojo.Items;

public interface ItemsMapper {
    Items selectByid(int iid) throws Exception;

    int insertItems (Items items) throws Exception;
}