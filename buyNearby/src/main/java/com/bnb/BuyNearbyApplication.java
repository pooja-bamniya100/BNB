package com.bnb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BuyNearbyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyNearbyApplication.class, args);
	}

}
