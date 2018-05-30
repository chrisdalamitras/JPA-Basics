package com.JPABasics.api;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.JPABasics.api.model.User;
import com.JPABasics.api.repository.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Dante", "Admin");
		userRepository.save(user);
		log.info("New user is created using repository: " + user);

		Optional<User> userById = userRepository.findById(2L);
		log.info("User is retrived using repository: " + userById);

		List<User> allUsers = userRepository.findAll();
		log.info("All users are retrived using repository: " + allUsers);
	}

}
