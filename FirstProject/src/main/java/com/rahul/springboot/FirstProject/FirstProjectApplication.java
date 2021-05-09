package com.rahul.springboot.FirstProject;

import com.rahul.springboot.FirstProject.basics.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		Alien a = context.getBean(Alien.class);
		a.show();

		// NOTE: Spring boot uses the concept of singleton design pattern.
		// even if you call the alien class twice, "Object Created" will only be printed once.
		// because singleton will only create the object once.
		// Alien a1 = context.getBean(Alien.class);
		// a1.show();

		// NOTE: there can be two scopes. by default - Singleton and Prototype
		// @Scope(value="prototype")
		// if you do prototype, the object will be created when you do getBean


		System.out.println("First spring boot project");
	}

}
