package com.course.portf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.portf.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
