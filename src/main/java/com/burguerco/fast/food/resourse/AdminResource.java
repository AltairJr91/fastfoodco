package com.burguerco.fast.food.resourse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.burguerco.fast.food.entities.Admin;

@RestController
@RequestMapping(value="/admins")
public class AdminResource {
	
	public ResponseEntity<Admin> findAll(){
		Admin administrator = new Admin(1L,"josue", "1234", 1);
		return ResponseEntity.ok().body(administrator);
	}
	
}
