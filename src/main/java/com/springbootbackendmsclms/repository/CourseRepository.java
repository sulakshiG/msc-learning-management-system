package com.springbootbackendmsclms.repository;

import com.springbootbackendmsclms.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
}
