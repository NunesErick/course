package com.course.portf.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.course.portf.entities.Order;
import com.course.portf.entities.User;
import com.course.portf.entities.enums.OrderStatus;
import com.course.portf.repositories.OrderRepository;
import com.course.portf.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User( "Érick de Souza Nunes", "erick.szns@hotmail.com", "47997187766", "15084");
		User u2 = new User( "Nataly Araujo", "nataly.araujo@gmail.com", "4799782147", "123456");
		
		Order o1 = new Order(Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.CANCELED, u1);
		Order o2 = new Order(Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.PAID, u1); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
}
