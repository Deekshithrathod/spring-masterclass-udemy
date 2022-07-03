package com.in28minues.spring.basics.springin5steps;

import com.in28minues.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minues.spring.basics.springin5steps.xml.XmlPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Configuration
//@ComponentScan
public class SpringIn5StepsApplicationXml {

	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsApplicationXml.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		XmlPersonDao xmlPersonDao = applicationContext.getBean(XmlPersonDao.class);
		logger.info("{}",xmlPersonDao);
		logger.info("Beans Loaded -> {}",(Object) applicationContext.getBeanDefinitionNames());

	}

}
