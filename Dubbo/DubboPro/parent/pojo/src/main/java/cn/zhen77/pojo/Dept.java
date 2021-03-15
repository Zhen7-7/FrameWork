package cn.zhen77.pojo;

import java.io.Serializable;

/**
 * @author : zhen77
 * @date: 2021/3/15 - 03 - 15 - 14:52
 * @Description: cn.zhen77.pojo
 * @version: 1.0
 */
public class Dept implements Serializable {
    private Integer id;

    private String name;

    public Dept() {
    }

    public Dept(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
