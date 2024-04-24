package com.springbootbackendmsclms.controller;

import com.springbootbackendmsclms.entity.Course;
import com.springbootbackendmsclms.repository.CourseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {

        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<Course> getAllCourses() {

        return courseRepository.findAll();
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {

        return courseRepository.save(course);
    }




}
