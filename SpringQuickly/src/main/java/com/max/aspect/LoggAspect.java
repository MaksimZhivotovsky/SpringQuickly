package com.max.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggAspect {
	
	private Logger logger = Logger.getLogger(LoggAspect.class.getName());
	
	@Pointcut("execution( * com.max.test.*.*(..))")
	public void test() {}
	
	@Around("test()")
	public void log(ProceedingJoinPoint joinPoint) throws Throwable {
		logger.info("Method will execute");
		joinPoint.proceed();
		System.out.println("END");
	}

}
