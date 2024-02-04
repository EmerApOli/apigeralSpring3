package com.geral.apigeral;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.geral.apigeral.*")
@ComponentScan({"com.geral.apigeral.*"})
public class ApigeralApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigeralApplication.class, args);
	}

}
