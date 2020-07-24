package com.course.portf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.portf.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}