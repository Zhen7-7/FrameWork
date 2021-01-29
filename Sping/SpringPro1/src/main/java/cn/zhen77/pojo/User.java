package cn.zhen77.pojo;

/**
 * @author : zhen77
 * @date: 2021/1/29 - 01 - 29 - 14:01
 * @Description: cn.zhen77.pojo
 * @version: 1.0
 */
public class User {
    private Integer uid = 520;
    private String uname = "77";
    private Integer uage = 19;
    private String usex = "男";


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public User() {
    }

    public User(Integer uid, String uname, Integer uage, String usex) {
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
        this.usex = usex;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                ", usex='" + usex + '\'' +
                '}';
    }
}
