package cn.zhen77.pojo;

/**
 * @author : zhen77
 * @date: 2021/2/9 - 02 - 09 - 10:49
 * @Description: cn.zhen77.pojo
 * @version: 1.0
 */
public class Person {
    private int pid;
    private User user;

    public Person() {
    }

    public Person(int pid, User user) {
        this.pid = pid;
        this.user = user;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", user=" + user +
                '}';
    }
}
