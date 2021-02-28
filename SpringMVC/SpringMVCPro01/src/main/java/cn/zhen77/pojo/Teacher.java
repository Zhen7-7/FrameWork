package cn.zhen77.pojo;

/**
 * @author : zhen77
 * @date: 2021/2/3 - 02 - 03 - 14:20
 * @Description: cn.zhen77.pojo
 * @version: 1.0
 */
public class Teacher {
    private Integer teaId;
    private String  teaName;

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public Teacher() {
    }

    public Teacher(Integer teaId, String teaName) {
        this.teaId = teaId;
        this.teaName = teaName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaId=" + teaId +
                ", teaName='" + teaName + '\'' +
                '}';

    }
}
