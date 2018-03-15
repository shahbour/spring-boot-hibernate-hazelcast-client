package com.shahbour.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CacheApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CacheApplication.class, args);
	}

	@Autowired
	PersonRepository personRepository;

	@Override
	public void run(String... strings) throws Exception {
		personRepository.save(new Person(1,"Ali"));
	}
}
