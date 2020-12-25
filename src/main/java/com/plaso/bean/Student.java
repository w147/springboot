package com.plaso.bean;

public class Student {
    private int id;
    private String loginname;
    private String name;

    public Student(int id, String name, String loginname) {
        this.id = id;
        this.name = name;
        this.loginname = loginname;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return loginname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.loginname = address;
    }

}
