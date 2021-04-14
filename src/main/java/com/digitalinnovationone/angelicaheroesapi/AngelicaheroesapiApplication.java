package com.digitalinnovationone.angelicaheroesapi;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories
public class AngelicaheroesapiApplication {

	public static void main(String[] args) {

		SpringApplication.run(AngelicaheroesapiApplication.class, args);
		System.out.println("super poderes com webflux");
	}

}
