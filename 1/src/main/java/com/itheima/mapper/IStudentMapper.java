package com.itheima.mapper;


import com.itheima.pojo.Course;

import java.util.List;

public interface IStudentMapper {
    List<Course> selectById(int id); //子任务1

    List<Course> selectByschoolName(String schoolName); //子任务2

    int updateById(Course course);//子任务3

    void addCourse(Course course);//子任务4

    List<Course> selectAll();//子任务5

}
