package com.itheima.pojo;

public class School {
    private  Integer schoolId;
    private String schoolName;

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int id) {
        this.schoolId = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "学院id"+getSchoolId()+","+"学院名称:"+getSchoolName();
    }
}
