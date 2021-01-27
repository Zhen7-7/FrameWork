package cn.zhen77.pojo;

public class OrderDetail {
    private Integer odid;

    private String orderid;

    //注释掉订单id

    /*private Integer itemid;*/

    private Integer itemnum;

    private Items items ; //订单详情和订单商品是一对一关系

    public Integer getOdid() {
        return odid;
    }

    public void setOdid(Integer odid) {
        this.odid = odid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

   /* public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }*/


    public Integer getItemnum() {
        return itemnum;
    }

    public void setItemnum(Integer itemnum) {
        this.itemnum = itemnum;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public OrderDetail() {
    }

    public OrderDetail(Integer odid, String orderid, Integer itemnum, Items items) {
        this.odid = odid;
        this.orderid = orderid;
        this.itemnum = itemnum;
        this.items = items;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "odid=" + odid +
                ", orderid='" + orderid + '\'' +
                ", itemnum=" + itemnum +
                ", items=" + items +
                '}';
    }
}