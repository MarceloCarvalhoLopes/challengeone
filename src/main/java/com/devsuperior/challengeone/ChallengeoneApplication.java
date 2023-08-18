package com.devsuperior.challengeone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeoneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeoneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");
	}
}
