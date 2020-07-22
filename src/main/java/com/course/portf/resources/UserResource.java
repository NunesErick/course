package com.course.portf.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.portf.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Érick","érick.szns@hotmail.com","47997187766","15084");
		return ResponseEntity.ok().body(u);
	}
}
