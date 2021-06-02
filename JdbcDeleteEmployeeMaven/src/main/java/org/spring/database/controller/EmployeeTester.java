package org.spring.database.controller;

import org.spring.database.bean.Employee;
import org.spring.database.dao.EmployeeDelete;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTester {
	public static void main(String[] args) {
	ApplicationContext ac=	new ClassPathXmlApplicationContext("spring.database.connection.xml");
	
	EmployeeDelete ed = ac.getBean("employeeDelete", EmployeeDelete.class);
	ed.deleteEmployee(1010);
	System.out.println("1010 emp_id is deleted from db");
	}
}
