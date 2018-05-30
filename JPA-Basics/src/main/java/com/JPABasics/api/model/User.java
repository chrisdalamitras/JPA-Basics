package com.JPABasics.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	private String role;
	
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
}
