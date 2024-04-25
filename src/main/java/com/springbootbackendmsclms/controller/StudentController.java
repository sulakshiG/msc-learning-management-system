package com.springbootbackendmsclms.controller;

import com.springbootbackendmsclms.entity.Student;
import com.springbootbackendmsclms.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springbootbackendmsclms.exception.ResourceNotFoundException;

import java.util.List;


@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    // GET request to retrieve all students
    @GetMapping
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    @GetMapping("/{studentIndex}")
    public Student getStudent(@PathVariable String studentIndex) {
        return studentRepository.findById(studentIndex).orElseThrow(RuntimeException::new);
    }

    // POST request to create a new student
    @PostMapping
    public Student createStudent(@RequestBody Student student) {

        return studentRepository.save(student);
    }

//    // PUT request to update an existing student
//    @PutMapping("/{studentIndex}")
//    public ResponseEntity<Student> updateStudent(@PathVariable("studentIndex") String id, @RequestBody Student studentToBeUpdated) {
//        Student student = studentRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
//
//        student.setName(student.getName());
//        //Update other fields as needed
//
//        Student updatedStudent = studentRepository.save(student);
//        return ResponseEntity.ok(updatedStudent);
//    }



    // DELETE request to delete a student by ID
    @DeleteMapping("/{studentIndex}")
    public ResponseEntity<?> deleteStudent(@PathVariable("studentIndex") String id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
