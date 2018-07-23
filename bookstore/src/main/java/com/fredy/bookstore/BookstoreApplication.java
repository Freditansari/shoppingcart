package com.fredy.bookstore;

import com.fredy.bookstore.config.SecurityUtility;
import com.fredy.bookstore.domain.User;
import com.fredy.bookstore.domain.security.Role;
import com.fredy.bookstore.domain.security.UserRole;
import com.fredy.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user1 = new User();
//		user1.setFirstName("John");
//		user1.setLastName("Adams");
//		user1.setUserName("j");
//		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
//		user1.setEmail("JAdams@gmail.com");
//		Set<UserRole> userRoles = new HashSet<>();
//		Role role1 = new Role();
//		//role1.setRoleID(1);
//		role1.setName("ROLE_USER");
//		userRoles.add(new UserRole(user1, role1));
//
//		userService.createUser(user1, userRoles);
//
//		userRoles.clear();
//
//		User user2 = new User();
//		user2.setFirstName("Admin");
//		user2.setLastName("Admin");
//		user2.setUserName("admin");
//		user2.setPassword(SecurityUtility.passwordEncoder().encode("p"));
//		user2.setEmail("Admin@gmail.com");
//		Role role2 = new Role();
//		//role2.setRoleID(0);
//		role2.setName("ROLE_ADMIN");
//		userRoles.add(new UserRole(user2, role2));
//
//		userService.createUser(user2, userRoles);


	}
}
