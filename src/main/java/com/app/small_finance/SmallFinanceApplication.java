package com.app.small_finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Small Finance"))
public class SmallFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallFinanceApplication.class, args);
	}

}
