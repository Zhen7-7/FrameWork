package cn.zhen77.util;

import cn.zhen77.pojo.Users;

import java.util.List;

/**
 * @author : zhen77
 * @date: 2021/1/27 - 01 - 27 - 16:09
 * @Description: cn.zhen77.util
 * @version: 1.0
 */
public class Page {
    //一共有多少条数据
    private Integer datacount;

    //每页显示多少条数据
    private Integer showdata;

    //一共分成多少页
    private Integer pagecount;

    //当前是第几页
    private Integer pageindex;

    //当前页面显示的集合信息
    private List<Users> list;

    public Integer getDatacount() {
        return datacount;
    }

    public void setDatacount(Integer datacount) {
        this.datacount = datacount;
    }

    public Integer getShowdata() {
        return showdata;
    }

    public void setShowdata(Integer showdata) {
        this.showdata = showdata;
    }

    public Integer getPagecount() {
        return (this.datacount%this.showdata==0?(this.datacount/this.showdata):((this.datacount/this.showdata)+1));
    }

    /*
    public void setPagecount(Integer pagecount) {
        this.pagecount = pagecount;
    }
    */
    public Integer getPageindex() {
        return pageindex;
    }

    public void setPageindex(Integer pageindex) {
        this.pageindex = pageindex;
    }

    public List<Users> getList() {
        return list;
    }

    public void setList(List<Users> list) {
        this.list = list;
    }
}