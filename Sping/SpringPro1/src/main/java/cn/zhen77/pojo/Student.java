package cn.zhen77.pojo;

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

    public Student(Integer stuid, String stuname, Integer stuage) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.stuage = stuage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", stuage=" + stuage +
                '}';
    }
    public void stuInit(){
        System.out.println("对Student对象进行初始化操作");
    }
    public void stuDes(){
        System.out.println("对象被销毁");
    }
}
