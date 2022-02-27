package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.service.LoginService;

@RestController
@RequestMapping("/Login")
public class LoginController {
	
	@Autowired
	private LoginService serve;
	
	@GetMapping
    public String loginUser(@RequestBody User loginEntity){
		
		User obj= serve.findbyEmail(loginEntity.getEmail());
		System.out.println("log"+obj);
		if(obj!=null) {
			if(obj.getEmail().equals(loginEntity.getEmail()) && obj.getPassword().equals(loginEntity.getPassword())) {
				
				return "Valid User";
			}
			else {
				return "Invalid User";
			}
		}
		
		return "Invalid User";
    }


}
