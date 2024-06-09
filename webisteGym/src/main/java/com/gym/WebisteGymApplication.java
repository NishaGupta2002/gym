package com.gym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.controller","com.dao","com.model","com.service","com.gym"})	
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.dao")

public class WebisteGymApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebisteGymApplication.class, args);
	}

}
