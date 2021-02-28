package cn.zhen77.pojo;

import org.springframework.stereotype.Component;

/**
* @author : zhen77
* @date: 2021/2/1 - 02 - 01 - 11:02
* @Description: cn.zhen77.pojo
* @version: 1.0
*/
//实体类
@Component
public class Dept {
    private Integer deptno;

    private String dname;

    private String loc;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc == null ? null : loc.trim();
    }
}

