package com.javacodegeeks.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javacodegeeks.example.model.Student;
import com.javacodegeeks.example.repository.StudentRepository;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}
	
	// The CommanLineRunner interface is commonly used to run some task at the startup of a Spring Boot application.
	@Bean
	CommandLineRunner init(StudentRepository repository) {
		return args -> {
			repository.save(new Student("Jane", "Doe", "Junior"));
			repository.save(new Student("Martin", "Fowler", "Senior"));
			repository.save(new Student("Roy", "Fielding", "Freshman"));
		};
	}
}
