package com.practise.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.practice.models.Employee;

import dao.EmployeeDao;

public class Test3 {
	@Test
	public void testusing_Mocks() throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		EmployeeDao employeeDAO = mock(EmployeeDao.class);
		Employee employee = new Employee();
		employee.setEmail("gp@gmail.com");
		employee.setId(2);
		employee.setFname("Kayal");
		employee.setLname("priya");
		employee.setPhone("9017166250");
		when(employeeDAO.getById(1)).thenReturn(employee);
		System.out.println(employeeDAO.getById(1).getEmail());
		assertEquals("gp@gmail.com", employeeDAO.getById(1).getEmail());
	}
}
