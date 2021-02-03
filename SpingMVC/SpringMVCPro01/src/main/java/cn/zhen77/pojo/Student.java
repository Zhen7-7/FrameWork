package cn.zhen77.pojo;

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

    public Student(Integer stuId, String stuName, double stuHeight, boolean isGraduate) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuHeight = stuHeight;
        this.isGraduate = isGraduate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuHeight=" + stuHeight +
                ", isGraduate=" + isGraduate +
                '}';
    }
}
