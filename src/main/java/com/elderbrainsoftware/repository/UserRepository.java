package com.elderbrainsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elderbrainsoftware.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
