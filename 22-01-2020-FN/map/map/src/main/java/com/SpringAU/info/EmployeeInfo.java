package com.SpringAU.info;

import java.util.Map;

import com.SpringAU.pojo.Employee;

public class EmployeeInfo {
	private Map<String, Employee> employee;

	public EmployeeInfo(Map<String, Employee> employee) {
		this.employee = employee;
	}

	public void listemployee() {
		System.out.println("Map Implementation\n");
		for (Map.Entry<String, Employee> i : employee.entrySet()) {
			i.getValue().showContent();
		}
	}
}
