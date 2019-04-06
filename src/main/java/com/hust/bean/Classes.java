package com.hust.bean;

/**
 * Create By LaserZhao On 2019-04-05
 */
public class Classes {

    Integer cid;
    String name;
    String description;

    public Classes(Integer cid, String name, String description) {
        this.cid = cid;
        this.name = name;
        this.description = description;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
