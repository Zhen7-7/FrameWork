package cn.zhen77.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author : zhen77
 * @date: 2021/1/29 - 01 - 29 - 22:03
 * @Description: cn.zhen77.pojo
 * @version: 1.0
 */
public class Student {
    private Integer stuid;
    private String stuname;
    private Integer stuage;

    private User user;//Student 依赖于USer
    private int[] score;
    private List<Integer> list;
    private Set<Integer> set;
    private Map<String,Integer> map;
    private Properties pros;

    public Properties getPros() {
        return pros;
    }

    public void setPro(Properties pros) {
        this.pros = pros;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    public Student() {
        System.out.println("Student对象被创建");
    }

    public Student(Integer stuid, String stuname, Integer stuage, User user) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.stuage = stuage;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", stuage=" + stuage +
                ", user=" + user +
                '}';
    }

    public void stuInit(){
        System.out.println("对Student对象进行初始化操作");
    }
    public void stuDes(){
        System.out.println("对象被销毁");
    }
}
