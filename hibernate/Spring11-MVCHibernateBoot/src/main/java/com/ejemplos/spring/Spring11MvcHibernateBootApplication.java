package com.ejemplos.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Spring11MvcHibernateBootApplication extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Spring11MvcHibernateBootApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Spring11MvcHibernateBootApplication.class, args);
	}
}
