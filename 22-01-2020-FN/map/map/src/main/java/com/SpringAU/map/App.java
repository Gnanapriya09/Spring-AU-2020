package com.SpringAU.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringAU.info.EmployeeInfo;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("map.xml");
		EmployeeInfo employee = context.getBean(EmployeeInfo.class);
		employee.listemployee();
	}
}
