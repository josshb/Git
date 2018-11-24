package com.pruebas.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//same as @Configuration @EnableAutoConfiguration @ComponentScan
// No necesito la ruta para los controladores

/*
 * Many Spring Boot developers always have their main class annotated with @Configuration, @EnableAutoConfiguration and @ComponentScan. Since these annotations are so frequently used together (especially if you follow the best practices above), Spring Boot provides a convenient @SpringBootApplication alternative.

* The @SpringBootApplication annotation is equivalent to using  @Configuration, @EnableAutoConfiguration and @ComponentScan with their default attributes
 * 
 * 
 */
// When you run a Spring Boot Application, (annotated with @SpringBootApplication), 
//   Spring will only scan the classes below your main class package.
@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}
}
