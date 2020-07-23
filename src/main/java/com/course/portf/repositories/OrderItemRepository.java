package com.course.portf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.portf.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{

}
