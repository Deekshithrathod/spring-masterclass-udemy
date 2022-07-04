package com.in28minues.spring.basics.springin5steps;

import com.in28minues.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsApplicationCdi {
	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsApplicationCdi.class);

	public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsApplicationCdi.class);
		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);
		logger.info("{}, with dao -> {} ", someCdiBusiness, someCdiBusiness.getSomeCdiDao());
	}

}
