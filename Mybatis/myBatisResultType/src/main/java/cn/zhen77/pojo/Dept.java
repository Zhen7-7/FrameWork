package cn.zhen77.pojo;

import java.util.List;

public class Dept {
    private Integer deptno;

    private String dname;

    private String loc;

    private List<Emp> emps;
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

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public Dept() {
    }

    public Dept(Integer deptno, String dname, String loc, List<Emp> emps) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
        this.emps = emps;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                ", emps=" + emps +
                '}';
    }
}