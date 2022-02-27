package com.example.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;

	public void create(User userEntity){
		userRepo.save(userEntity);
    }
	
	public void delete(Integer uid){
		userRepo.deleteById(uid);
    }
	
	public void update(User userEntity){
		userRepo.save(userEntity);
    }
	
	public List<User> listAll(){
		return userRepo.findAll();
    }
	
}
