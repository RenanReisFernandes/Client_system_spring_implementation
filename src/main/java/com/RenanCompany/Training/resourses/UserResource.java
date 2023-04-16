package com.RenanCompany.Training.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RenanCompany.Training.entity.User;

@RestController
@RequestMapping(value ="/Users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "Renan", "renan@email.com", "9999999", "1234");
		return ResponseEntity.ok().body(u);
	}

}
