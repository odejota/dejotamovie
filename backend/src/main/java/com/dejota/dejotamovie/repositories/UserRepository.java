package com.dejota.dejotamovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dejota.dejotamovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}