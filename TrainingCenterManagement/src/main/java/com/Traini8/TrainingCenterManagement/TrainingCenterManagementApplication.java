package com.Traini8.TrainingCenterManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TrainingCenterManagementApplication {

	public static void main(String[] args)
	{
		//spring container creation
		ApplicationContext context =SpringApplication.run(TrainingCenterManagementApplication.class, args);

	}

}
