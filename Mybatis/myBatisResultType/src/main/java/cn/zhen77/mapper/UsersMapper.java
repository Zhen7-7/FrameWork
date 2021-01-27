package cn.zhen77.mapper;

import cn.zhen77.pojo.Users;
import cn.zhen77.util.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UsersMapper {
    //根据用户编号查看用户下,所有的订单,订单详情,商品信息
    List<Users> selectAll(int uid) throws Exception;

    //用于分页 获得一共有多少条数据
    int selectCount() throws Exception;

    //用于分页  获得当前页 显示的集合信息
    List<Users> selectUserByPage(Page page) throws Exception;

    //使用RowBounds插件
    List<Users> findall(RowBounds rb);
}