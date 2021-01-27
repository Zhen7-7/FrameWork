package cn.zhen77.pojo;

import java.util.Date;
import java.util.List;

public class Orders {
    private Integer oid;

    private Integer userid;

    private String orderid;

    private Date createtime;

    private String status;

    private List<OrderDetail> orderDetail ; // 订单和订单详情是一对多的关系


    public List<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetails(List<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Orders() {

    }

    public Orders(Integer oid, Integer userid, String orderid, Date createtime, String status, List<OrderDetail> orderDetails) {
        this.oid = oid;
        this.userid = userid;
        this.orderid = orderid;
        this.createtime = createtime;
        this.status = status;
        this.orderDetail = orderDetails;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", userid=" + userid +
                ", orderid='" + orderid + '\'' +
                ", createtime=" + createtime +
                ", status='" + status + '\'' +
                ", orderDetails=" + orderDetail +
                '}';
    }
}