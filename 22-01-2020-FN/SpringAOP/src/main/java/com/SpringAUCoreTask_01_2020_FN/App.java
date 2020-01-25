package com.SpringAUCoreTask_01_2020_FN;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.Manager;

public class App {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("aspect.xml");
		Manager manager = context.getBean(Manager.class);
		manager.listAllEmployees();
	}
}
