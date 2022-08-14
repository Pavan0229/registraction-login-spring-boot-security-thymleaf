package com.javaguide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguide.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
