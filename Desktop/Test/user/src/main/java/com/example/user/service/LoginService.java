package com.example.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.entity.User;
import com.example.user.repository.LoginRepository;
import com.example.user.repository.UserRepository;


@Service
public class LoginService {
	
	@Autowired
	private LoginRepository userRepo;
	
	public User findbyEmail(String email) {
		
		return userRepo.findbyEmail(email);
		
	}
}
