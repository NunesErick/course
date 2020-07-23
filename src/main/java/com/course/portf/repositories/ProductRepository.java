package com.course.portf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.portf.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
