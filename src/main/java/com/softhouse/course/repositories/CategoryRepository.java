package com.softhouse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softhouse.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}