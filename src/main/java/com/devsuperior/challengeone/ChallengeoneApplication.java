package com.devsuperior.challengeone;

import com.devsuperior.challengeone.entities.Order;
import com.devsuperior.challengeone.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.Locale;

@SpringBootApplication
public class ChallengeoneApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeoneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Order order = new Order(2282,800.00,10.00);
		System.out.println("Order code : " + order.getCode());
		System.out.printf("Total value : %.2f%n ",orderService.total(order));

	}
}
