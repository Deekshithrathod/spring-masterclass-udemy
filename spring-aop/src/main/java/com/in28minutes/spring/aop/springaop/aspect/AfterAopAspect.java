package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Around(value = "execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
//    public void before(ProceedingJoinPoint joinPoint) throws Throwable{
//        long startTime = System.currentTimeMillis();
//        joinPoint.proceed();
//        long timeTaken = System.currentTimeMillis()-startTime;
//        logger.info("Time taken by {} is -> {}ms",joinPoint,timeTaken);
//    }

}
