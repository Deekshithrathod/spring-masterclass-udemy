package com.in28minues.spring.basics.springin5steps;

import com.in28minues.spring.basics.springin5steps.scope.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIn5StepsApplicationScope {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsApplicationScope.class);

		PersonDao personDao = applicationContext.getBean(PersonDao.class);
		PersonDao personDao1 = applicationContext.getBean(PersonDao.class);

		System.out.println(personDao1);
		System.out.println(personDao);
		System.out.println("--------------------------------");
		System.out.println(personDao1.getJdbcConnection());
		System.out.println(personDao.getJdbcConnection());

	}

}
