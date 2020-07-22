package com.course.portf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.portf.entities.Order;

public interface OrderRepository extends JpaRepository<Order , Long>{

}
