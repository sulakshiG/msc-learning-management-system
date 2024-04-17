package com.springbootbackendmsclms.repository;

import com.springbootbackendmsclms.entity.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchRepository extends JpaRepository<Batch, String> {
}
