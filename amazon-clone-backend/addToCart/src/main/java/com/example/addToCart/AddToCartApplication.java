package com.example.addToCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AddToCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddToCartApplication.class, args);
	}

}
