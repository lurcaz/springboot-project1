package com.springproject1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject1.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
