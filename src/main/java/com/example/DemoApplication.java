package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true)
public class DemoApplication extends AbstractSecurityWebApplicationInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
