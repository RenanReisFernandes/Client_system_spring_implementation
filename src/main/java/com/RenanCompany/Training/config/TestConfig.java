package com.RenanCompany.Training.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.RenanCompany.Training.entity.Category;
import com.RenanCompany.Training.entity.Order;
import com.RenanCompany.Training.entity.User;
import com.RenanCompany.Training.entity.enums.OrderStatus;
import com.RenanCompany.Training.repositories.CategoryRepository;
import com.RenanCompany.Training.repositories.OrderRepository;
import com.RenanCompany.Training.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers"); 
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2023-04-18T19:55:07Z"),OrderStatus.DELIVERED, u1);
		Order o2 = new Order(null, Instant.parse("2023-05-06T14:55:07Z"),OrderStatus.SHIPPED, u2);
		Order o3 = new Order(null, Instant.parse("2023-06-25T19:55:07Z"),OrderStatus.CANCELED, u1);
		
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	}

}
