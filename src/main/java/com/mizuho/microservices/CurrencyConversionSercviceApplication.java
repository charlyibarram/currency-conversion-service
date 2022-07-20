package com.mizuho.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyConversionSercviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionSercviceApplication.class, args);
	}

}
