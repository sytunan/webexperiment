package com.itheima.pojo;

public class Course {
    private Integer id;
    private String name;
    private Integer hours;
    private Integer schoolId;

    private String  school;
    public int getId() {
        return id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    public String toString() {
        if(school.equals(null))
        {return "课程id:"+getId()+","+"课程名:"+getName()+","+"课时:"+getHours()+","+"开课学院:"+getSchoolId();}
        else
        {return "课程id:"+getId()+","+"课程名:"+getName()+","+"课时:"+getHours()+","+"开课学院:"+getSchoolId()+","+"学院名称:"+getSchool();}
    }
}
