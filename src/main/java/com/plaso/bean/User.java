package com.plaso.bean;

import java.sql.Timestamp;

public class User {
    private Long id;
    private String name;
    private int age;
    private String address;
    private String description;
    private Long test_id;
    private Timestamp createTime;
    private Timestamp updateTime;

    public User(Long id, String name, int age, String address, String description, Long test_id, Timestamp createTime, Timestamp updateTime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.description = description;
        this.test_id = test_id;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public Long getTest_id() {
        return test_id;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTest_id(Long test_id) {
        this.test_id = test_id;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
