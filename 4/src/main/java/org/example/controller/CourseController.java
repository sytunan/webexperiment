package org.example.controller;

import org.example.domain.Course;
import org.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public boolean save(@RequestBody Course course) {
        return courseService.save(course);
    }

    @PutMapping
    public boolean update(@RequestBody Course course) {
        return courseService.update(course);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return courseService.delete(id);
    }

    @GetMapping ("/{id}")
    public Course getById(@PathVariable Integer id){
        return courseService.getById(id);
    }
    @GetMapping
    public List<Course> getAll() {
        return courseService.getAll();
    }
}



