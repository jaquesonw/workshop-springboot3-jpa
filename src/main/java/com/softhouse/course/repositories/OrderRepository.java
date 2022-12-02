package com.softhouse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softhouse.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}