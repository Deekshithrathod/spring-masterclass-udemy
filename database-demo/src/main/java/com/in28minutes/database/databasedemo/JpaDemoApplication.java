package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.jdbc.Person;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("received -> {}",(Object) repository.findAll());

		logger.info("found by ID {}", repository.findById(10001));
		logger.info("updated person, rows affected {}",repository.insert(new Person(10009,"SuperNova","Banglore",new Date(System.currentTimeMillis()))));
		logger.info("updated person, rows affected {}",repository.update(new Person(10002,"SuperNova","Banglore",new Date(System.currentTimeMillis()))));
		repository.delete(10002);
//		logger.info("delete by id, no of rows affected {}",repository.deleteById(10002));

		/*
		logger.info("found by Name {}", dao.findByName("Ranga"));


		logger.info("delete by id, no of rows affected {}",dao.deleteByName("Ranga"));

		logger.info("inserted person, rows affected {}",dao.insertPerson(new Person(10019,"NovaNotNova","Delhi",new Date(System.currentTimeMillis()))));

		logger.info("updated person, rows affected {}",dao.updatePerson(new Person(10003,"Platypus","DreamLand",new Date(System.currentTimeMillis()))));
		*/
	}
}
