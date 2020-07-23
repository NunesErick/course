package com.course.portf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.portf.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
