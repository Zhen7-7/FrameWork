package cn.zhen77.pojo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author : zhen77
 * @date: 2021/2/3 - 02 - 03 - 11:49
 * @Description: cn.zhen77.pojo
 * @version: 1.0
 */
public class Student {
    private Integer stuId;
    private String stuName;
    private double stuHeight;
    private boolean isGraduate;
    private Teacher tea;
    private String[] likes;
    private List<Teacher> teas;
    private Map<Integer,Teacher> maps;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<Integer, Teacher> getMaps() {
        return maps;
    }

    public void setMaps(Map<Integer, Teacher> maps) {
        this.maps = maps;
    }

    public List<Teacher> getTeas() {
        return teas;
    }

    public void setTeas(List<Teacher> teas) {
        this.teas = teas;
    }

    public Teacher getTea() {
        return tea;
    }

    public void setTea(Teacher tea) {
        this.tea = tea;
    }

    public String[] getLikes() {
        return likes;
    }

    public void setLikes(String[] likes) {
        this.likes = likes;
    }

    public Teacher getTeacher() {
        return tea;
    }

    public void setTeacher(Teacher teacher) {
        this.tea = teacher;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public double getStuHeight() {
        return stuHeight;
    }

    public void setStuHeight(double stuHeight) {
        this.stuHeight = stuHeight;
    }

    public boolean isGraduate() {
        return isGraduate;
    }

    public void setGraduate(boolean graduate) {
        isGraduate = graduate;
    }

    public Student() {
    }

    public Student(Integer stuId, String stuName, double stuHeight, boolean isGraduate, Teacher tea, String[] likes,List<Teacher> teas,Map<Integer,Teacher> maps,Date date) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuHeight = stuHeight;
        this.isGraduate = isGraduate;
        this.tea = tea;
        this.likes = likes;
        this.teas = teas;
        this.maps = maps;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuHeight=" + stuHeight +
                ", isGraduate=" + isGraduate +
                ", tea=" + tea +
                ", likes=" + Arrays.toString(likes) +
                ", teas=" + teas +
                ", maps=" + maps +
                '}';
    }
}
