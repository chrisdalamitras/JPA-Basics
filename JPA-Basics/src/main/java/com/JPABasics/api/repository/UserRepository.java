package com.JPABasics.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPABasics.api.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
