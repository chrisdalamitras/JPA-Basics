package com.JPABasics.api.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.JPABasics.api.model.User;

@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public long saveUser(User user) {
		entityManager.persist(user);
		return user.getId();
	}

}
