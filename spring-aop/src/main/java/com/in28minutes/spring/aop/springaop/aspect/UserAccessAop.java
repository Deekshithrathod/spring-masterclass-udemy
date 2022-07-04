package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAop {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
//    * com.in28minutes.spring.aop.springaop.business.*.*(..)
//    * com.in28minutes.spring.aop.springaop.business.*.*(..)
    @Before("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint){
        logger.info("Before {}",joinPoint);
    }

//    @AfterReturning(value = "execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))", returning = "result")
//    public void afterReturn(JoinPoint joinPoint, Object result){
//        logger.info("After returning {} return with -> {}",joinPoint, result);
//    }
//
//    @After(value = "execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
//    public void after(JoinPoint joinPoint){
//        logger.info("After return {}",joinPoint);
//    }
//
//    @AfterThrowing(value = "execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
//    public void afterThrowing(JoinPoint joinPoint){
//        logger.info("After throwing {} ",joinPoint);
//    }
}
