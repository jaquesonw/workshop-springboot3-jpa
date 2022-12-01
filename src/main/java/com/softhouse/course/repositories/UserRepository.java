package com.softhouse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softhouse.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
