package com.springbootbackendmsclms.repository;

import com.springbootbackendmsclms.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, String> {
}
