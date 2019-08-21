package com.mongodb.mongo.Controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.mongo.Repository.userRepo;
import com.mongodb.mongo.Services.userService;
import com.mongodb.mongo.one.users;

@RestController
@RequestMapping("/users")
public class MongoController {

	@Autowired

	private userService userservice;

	@GetMapping("/add")
	public String createUser(@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("emailid") String emailid,@RequestParam("age") String age,@RequestParam("salary") String salary, @RequestParam("contactNo") BigInteger contactNo) {

		return userservice.createUser(username, password, emailid,age,salary, contactNo);
	}
	
	@GetMapping("/del")
	public String removeUsers() {

		return userservice.removeUser();
	}
	
	
	//update command
	//> db.tusers.update({username:"chai"},{username:"lol",password:"as",emailid:"gm.com",contactNo:"33"})
	
	
	
	@GetMapping("/allusers")
	public List<users> listUsers() {

		return userservice.listusers();
	}


}