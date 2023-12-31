package com.natwest.Cashwave.CreditcardService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CreditcardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditcardServiceApplication.class, args);
	}

}
