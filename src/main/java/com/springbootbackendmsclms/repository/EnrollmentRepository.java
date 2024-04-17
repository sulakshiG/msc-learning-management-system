package com.springbootbackendmsclms.repository;

import com.springbootbackendmsclms.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {
}

