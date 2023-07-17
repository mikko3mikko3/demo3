package com.example.demo3.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.data.entity.Users;

public interface UsersRepository extends JpaRepository<Users, String> {

}