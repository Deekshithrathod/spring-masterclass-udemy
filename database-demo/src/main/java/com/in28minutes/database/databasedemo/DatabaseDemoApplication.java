package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.jdbc.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("received -> {}",dao.findAll());

		logger.info("found by ID {}", dao.findById(10001));

		logger.info("found by Name {}", dao.findByName("Ranga"));

		logger.info("delete by id, no of rows affected {}",dao.deleteById(10002));

		logger.info("delete by id, no of rows affected {}",dao.deleteByName("Ranga"));

		logger.info("inserted person, rows affected {}",dao.insertPerson(new Person(10009,"SuperNova","Banglore",new Date(System.currentTimeMillis()))));
		logger.info("inserted person, rows affected {}",dao.insertPerson(new Person(10019,"NovaNotNova","Delhi",new Date(System.currentTimeMillis()))));

		logger.info("updated person, rows affected {}",dao.updatePerson(new Person(10003,"Platypus","DreamLand",new Date(System.currentTimeMillis()))));

	}
}
