package com.springbootbackendmsclms.controller;

import com.springbootbackendmsclms.entity.Course;
import com.springbootbackendmsclms.repository.CourseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {

        this.courseRepository = courseRepository;
    }

    // GET request to retrieve all courses
    @GetMapping
    public List<Course> getAllCourses() {

        return courseRepository.findAll();
    }

    // POST request to create a new course
    @PostMapping
    public Course createCourse(@RequestBody Course course) {

        return courseRepository.save(course);
    }

    //    // PUT request to update an existing student
//    @PutMapping("/{courseCode}")
//    public ResponseEntity<Course> updateCourse(@PathVariable("courseCode") String id, @RequestBody Course courseToBeUpdated) {
//        Course course = courseRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Course not found with code: " + id));
//
//        course.setCourseName(course.getCourseName());
//        //Update other fields as needed
//
//        Course updatedCourse = courseRepository.save(student);
//        return ResponseEntity.ok(updatedCourse);
//    }

    // DELETE request to delete a course by ID
    @DeleteMapping("/{courseCode}")
    public ResponseEntity<?> deleteCourse(@PathVariable("courseCode") String id) {
        if (courseRepository.existsById(id)) {
            courseRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
