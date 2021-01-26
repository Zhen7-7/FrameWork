package cn.zhen77.pojo;

import java.util.Date;

/**
 * @author : zhen77
 * @date: 2021/1/26 - 01 - 26 - 16:44
 * @Description: cn.zhen77.pojo
 * @version: 1.0
 */
public class EmpDept {
    private Integer deptno;

    private String dname;

    private String loc;

    private String ename;

    private String job;

    private Integer mgr;

    private Date hiredate;

    private Double sal;

    private Double comm;

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

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public EmpDept() {
    }

    public EmpDept(Integer deptno, String dname, String loc, String ename, String job, Integer mgr, Date hiredate, Double sal, Double comm) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
    }

    @Override
    public String toString() {
        return "EmpDept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                '}';
    }
}
