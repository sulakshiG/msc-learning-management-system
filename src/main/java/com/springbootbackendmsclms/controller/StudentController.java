package com.springbootbackendmsclms.controller;

import com.springbootbackendmsclms.entity.Student;
import com.springbootbackendmsclms.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    @GetMapping
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {

        return studentRepository.save(student);
    }
}
