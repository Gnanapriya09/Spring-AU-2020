package com.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeCRUD {
	long beginTime;
	long completionTime;

	@Before("execution(* com.aop.services.Manager.listAllEmployees())")
	public void atBeginning(JoinPoint joinPoint) {
		beginTime = System.currentTimeMillis();
		System.out.println("Method Execution Time Begins");
		//System.out.println(beginTime);
	}

	@After("execution(* com.aop.services.Manager.listAllEmployees())")
	public void atCompleted(JoinPoint joinPoint) {
		completionTime = System.currentTimeMillis();
		System.out.println("Method Execution Time Completed " + (completionTime - beginTime) + " milliseconds");
	}
}