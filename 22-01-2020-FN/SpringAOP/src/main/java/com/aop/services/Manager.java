package com.aop.services;

import java.util.ArrayList;
import java.util.List;

import com.aop.models.Employee;

public class Manager {

	public List<Employee> listAllEmployees() {
		List<Employee> employees_list = new ArrayList<Employee>();
		employees_list.add(new Employee("INT310", "Priya", "Software Engineer"));
		employees_list.add(new Employee("INT311", "Kayal", "Senior Software Engineer"));
		employees_list.add(new Employee("INT312", "Ram", "Business Analyst"));
		employees_list.add(new Employee("INT313", "Soniya", "Technical Delivery Manager"));
		System.out.println("\nEmployee List : ");
		for (int i = 0; i < employees_list.size(); i++) {
			System.out.println("ID : "+employees_list.get(i).getEmp_Id()+"\t Name: "+employees_list.get(i).getEmp_Name()+"\t Designation: "+employees_list.get(i).getEmp_designation());
		}
		System.out.println("\n");
		return employees_list;
	}
}
