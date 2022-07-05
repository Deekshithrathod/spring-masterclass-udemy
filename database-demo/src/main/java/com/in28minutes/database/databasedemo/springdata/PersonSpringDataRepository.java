package com.in28minutes.database.databasedemo.springdata;

import com.in28minutes.database.databasedemo.jdbc.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {
}
