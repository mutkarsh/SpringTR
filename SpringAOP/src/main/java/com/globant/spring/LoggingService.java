package com.globant.spring;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingService {
//	@Before("execution(* com.globant.spring.OrderService.placeorder(..))")
	//@Before("execution(* com.globant.spring.OrderService.*(..))")
	public void logbefore() {

		System.out.println("Before Logging...."+LocalDateTime.now());
	}
	
	//@After("execution(* com.globant.spring.OrderService.*(..))")
	public void logafter() {

		System.out.println("After Logging...."+LocalDateTime.now());
	}

	@Around("execution(* com.globant.spring.*.*.placeorder(..)) || execution(* com.globant.spring.*.placeorder(..)) ")
	public void logaround(ProceedingJoinPoint ojp) throws Throwable {
		System.out.println("Before Logging...."+LocalDateTime.now());
		Object result = ojp.proceed();
		System.out.println("After....Result : "+result);
		
	}
	
	@AfterReturning(value = "execution(* com.globant.spring.OrderService.placeorder(..))",returning = "result")
	public void logret(JoinPoint jp, Object result) {
		System.out.println(jp +"Returning..."+result);
	}
	


}
