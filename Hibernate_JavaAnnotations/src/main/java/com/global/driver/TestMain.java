package com.global.driver;

import java.util.List; 

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.global.beans.User;
import com.global.config.AppConfig;
import com.global.service.UserService;

public class TestMain {

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context = 
		            new AnnotationConfigApplicationContext(AppConfig.class);

		      UserService userService = context.getBean(UserService.class);

		      // Add Users
		      userService.add(new User("Siva Ram", "Veeramallu", "sivaramaster@gmail.com.com"));
		      userService.add(new User("harish", "singh", "harish.singh@example.com"));
		      userService.add(new User("Rana", "Pratap", "rana.pratap@example.com"));
		      

		      // Get Users
		      List<User> users = userService.listUsers();
		      for (User user : users) {
		         System.out.println("Id = "+user.getId());
		         System.out.println("First Name = "+user.getFirstName());
		         System.out.println("Last Name = "+user.getLastName());
		         System.out.println("Email = "+user.getEmail());
		         System.out.println();
		      }

		      context.close();


	}

}
