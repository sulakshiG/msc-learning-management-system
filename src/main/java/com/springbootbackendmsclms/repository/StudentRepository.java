package com.springbootbackendmsclms.repository;

import com.springbootbackendmsclms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}
