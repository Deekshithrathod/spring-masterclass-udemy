package com.in28minues.spring.basics.springin5steps;

import com.in28minues.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsApplication.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsApplication.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		logger.info("{}",binarySearch);
		System.out.println(binarySearch);
//		System.out.println(binarySearch);
//		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);



//		System.out.println(binarySearch1);
//		System.out.println(binarySearch);
//
//		System.out.println(binarySearch1.getSortAlgorithm());
//		System.out.println(binarySearch.getSortAlgorithm());
//
//		int result = binarySearch.binarySearch(new int[]{1,2,3,4}, 7);
//		System.out.println(result);
	}

}
