package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.jdbc.Person;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;
import com.in28minutes.database.databasedemo.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("received -> {}", repository.findAll());
		logger.info("found by ID {}", repository.findById(10001));

		logger.info("updated person, rows affected {}",repository.save(new Person(10009,"SuperNova","Banglore",new Date(System.currentTimeMillis()))));
//		logger.info("updated person, rows affected {}",repository.save(new Person(10002,"SuperNova","Banglore",new Date(System.currentTimeMillis()))));

	}
}
