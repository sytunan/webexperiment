package org.example.dao;

import org.apache.ibatis.annotations.*;
import org.example.domain.Course;

import java.util.List;


public interface CourseDao {

    @Insert("insert into course (name,hours,schoolId,schoolName) values(#{name},#{hours},#{schoolId},#{schoolName})")
    public int save(Course course);

    @Update("update course set name = #{name},hours=#{hours},schoolId=#{schoolId},schoolName=#{schoolName} where id = #{id}")
    public int update(Course course);

    @Delete("delete from course where id=#{id}")
    public int delete(Integer id);

    @Select("select * from course")
    public List<Course> getAll();

    @Select("select * from course where id = #{id}")
    public Course getById(Integer id);
}
