package cn.zhen77.mapper;

import cn.zhen77.pojo.OrderDetail;

public interface OrderDetailMapper {
    OrderDetail selectLazyLoadById(int odid) throws Exception;

}