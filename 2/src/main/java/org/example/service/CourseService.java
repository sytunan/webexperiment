package org.example.service;

import org.example.domain.Course;
import org.springframework.transaction.annotation.Transactional;

import java.net.Inet4Address;
import java.util.List;

@Transactional
public interface CourseService {
    public boolean save(Course course);

    public boolean update(Course course);

    public boolean delete(Integer id);

    public List<Course> getAll();

    public Course getById(Integer id);
}
