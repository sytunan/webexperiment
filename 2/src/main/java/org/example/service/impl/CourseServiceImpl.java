package org.example.service.impl;

import org.example.dao.CourseDao;
import org.example.domain.Course;
import org.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;
    @Override
    public boolean save(Course course) {
        return courseDao.save(course)>0;
    }

    @Override
    public boolean update(Course course) {
        return courseDao.update(course)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return courseDao.delete(id)>0;
    }

    @Override
    public List<Course> getAll() {
        return courseDao.getAll();
    }

    @Override
    public Course getById(Integer id) {
        return courseDao.getById(id);
    }
}
