package com.softhouse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softhouse.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}