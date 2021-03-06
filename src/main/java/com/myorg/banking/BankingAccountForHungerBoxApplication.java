package com.myorg.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BankingAccountForHungerBoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAccountForHungerBoxApplication.class, args);
	}

}
