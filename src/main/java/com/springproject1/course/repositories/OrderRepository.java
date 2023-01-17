package com.springproject1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject1.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
