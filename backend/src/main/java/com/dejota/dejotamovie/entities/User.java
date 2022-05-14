package com.dejota.dejotamovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	private String email;
	
	public User() {
	}

	public User(Long iD, String email) {
		this.ID = iD;
		this.email = email;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		this.ID = iD;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
