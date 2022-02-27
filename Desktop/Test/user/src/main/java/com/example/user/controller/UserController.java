package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService serve;
	
	@PostMapping("/create")
    public String addUser(@RequestBody User userEntity){

		serve.create(userEntity);
        return "Successfully added";
    }
	
	@DeleteMapping("/delete/{uid}")
    public String deleteUser(@PathVariable Integer uid){

		serve.delete(uid);
        return "Successfully removed";
    }
	
	@PutMapping("/update")
    public String updateUser(@RequestBody User userEntity){

		serve.update(userEntity);
        return "Successfully updated";
    }
	
	@GetMapping("/list")
    public List<User> listAllUser(){

		return serve.listAll();
     
    }

}
