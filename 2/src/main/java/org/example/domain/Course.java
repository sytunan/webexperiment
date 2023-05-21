package org.example.domain;

public class Course {
    private Integer id;
    private String name;
    private Integer hours;
    private Integer schoolId;

    private String schoolName;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getId() {
        return id;
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
        return "课程id:"+getId()+","+"课程名:"+getName()+","+"课时:"+getHours()+","+"开课学院:"+getSchoolId()+","+"学院名称:"+getSchoolName();
    }
}
