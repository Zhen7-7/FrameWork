package com.zhen77.pojo;

/**
 * @author : Zhen77
 * @date: 2021/1/22 - 01 - 22 - 19:22
 * @Description: com.zhen77.pojo
 * @version: 1.0
 *
 * 说明:
 *      属性名和列名完全相同
 */
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
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Dept() {
    }

    public Dept(Integer deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }
}
