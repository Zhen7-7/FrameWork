package cn.zhen77.pojo;

import java.io.Serializable;

/**
 * @author : zhen77
 * @date: 2021/3/15 - 03 - 15 - 14:53
 * @Description: cn.zhen77.pojo
 * @version: 1.0
 */
public class Emp implements Serializable {

    private Integer id;

    private String name;

    private String photo;

    private Integer did;

    public Emp() {
    }

    public Emp(Integer id, String name, String photo, Integer did) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.did = did;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", did=" + did +
                '}';
    }
}
