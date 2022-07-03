package com.in28minues.spring.basics.springin5steps;

import com.in28minues.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minues.spring.basics.springin5steps.properties.SomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.in28minues.spring.basics.springin5steps.properties")
@PropertySource("classpath:app.properties")
public class SpringIn5StepsApplicationProperties {

	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsApplicationProperties.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsApplicationProperties.class);
		logger.info("{}",(Object) applicationContext.getBeanDefinitionNames());

		SomeService someService = applicationContext.getBean(SomeService.class);
		logger.info("{}",someService);
		logger.info("{}",someService.getServiceURL());
	}

}
