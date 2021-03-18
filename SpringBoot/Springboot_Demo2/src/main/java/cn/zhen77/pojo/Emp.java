package cn.zhen77.pojo;

/**
 * @author : zhen77
 * @date: 2021/3/18 - 03 - 18 - 15:10
 * @Description: cn.zhen77.pojo
 * @version: 1.0
 */
public class Emp {
    private Integer eid;
    private String ename;
    private Integer did;

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", did='" + did + '\'' +
                '}';
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Emp(Integer eid, String ename, Integer did) {
        this.eid = eid;
        this.ename = ename;
        this.did = did;
    }

    public Emp() {
    }
}
