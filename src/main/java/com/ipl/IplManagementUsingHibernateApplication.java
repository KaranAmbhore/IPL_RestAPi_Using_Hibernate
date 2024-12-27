package com.ipl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IplManagementUsingHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplManagementUsingHibernateApplication.class, args);
		
		System.out.println("SpringBoot started on port 8091");
		System.out.println("Spring Application is Running");
	}

}
