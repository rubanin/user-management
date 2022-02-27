package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.user.entity.User;

@Repository
public interface LoginRepository  extends JpaRepository <User ,Integer> {
	
	@Query(value = "select * from ruban.User u where u.email = ?1", nativeQuery = true)
	User findbyEmail(String email);
	
}
