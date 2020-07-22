package com.course.portf.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.course.portf.entities.User;
import com.course.portf.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User( "Érick de Souza Nunes", "erick.szns@hotmail.com", "47997187766", "15084");
		User u2 = new User( "Nataly Araujo", "nataly.araujo@gmail.com", "4799782147", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
}
