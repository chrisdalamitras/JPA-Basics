package com.JPABasics.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.JPABasics.api.model.User;
import com.JPABasics.api.services.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDAOService;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Chris", "User");
		long userId = userDAOService.saveUser(user);
		log.info("New user is created using DAOService: " + user);
	}
	
}
