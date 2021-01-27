package cn.zhen77.mapper;

import cn.zhen77.pojo.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer odid);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer odid);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}