package com.in28minues.spring.basics.springin5steps;

import com.in28minutes.spring.basics.componentscan.PersonDaoComponentScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsApplicationComponentScan {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsApplicationComponentScan.class);

		PersonDaoComponentScan personDao = applicationContext.getBean(PersonDaoComponentScan.class);
		System.out.println(personDao);
		System.out.println(personDao.getJdbcConnection());
//		PersonDao personDao1 = applicationContext.getBean(PersonDao.class);
//
//		System.out.println(personDao1);
//		System.out.println(personDao);
//		System.out.println("--------------------------------");
//		System.out.println(personDao1.getJdbcConnection());
//		System.out.println(personDao.getJdbcConnection());

	}

}
