package com.springbootbackendmsclms.repository;

import com.springbootbackendmsclms.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, String> {
}
