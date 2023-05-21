package org.example;

import org.example.config.SpringConfig;
import org.example.domain.Course;
import org.example.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ServiceTest {
    @Autowired
    private CourseService courseService;

    @Test
    public void testGetAll(){
        List<Course> all = courseService.getAll();
        System.out.println(all);
    }
}
