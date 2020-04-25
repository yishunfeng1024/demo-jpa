package cn.ysf.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author YiShunFeng
 * @version 1.0
 * @description cn.ysf.demo.entity
 * @data 2020/4/25
 */
@Entity
@Table(name="boot_user")//指定和数据库那张表对应
public class User implements Serializable {
    @Id
    @Column(name="id")//指定对应表中的字段
    private int id;
    @Column(name="name")
    private String name;
    @Column(name = "password")
    private String password;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
