package cn.zhen77.pojo;

import java.awt.print.PrinterAbortException;
import java.security.PrivateKey;

/**
 * @author : zhen77
 * @date: 2021/2/10 - 02 - 10 - 11:47
 * @Description: cn.zhen77.pojo
 * @version: 1.0
 */
public class User {
    private int uid=12;
    private String uname="zhen77";
    private int uage=22;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public User() {
    }

    public User(int uid, String uname, int uage) {
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                '}';
    }
}
