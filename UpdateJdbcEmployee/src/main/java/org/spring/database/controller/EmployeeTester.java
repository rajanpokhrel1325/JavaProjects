package org.spring.database.controller;

import org.spring.database.bean.Employee;
import org.spring.database.dao.EmployeeUpdate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTester {
	public static void main(String[] args) {
	ApplicationContext ac=	new ClassPathXmlApplicationContext("config.xml");
	
	EmployeeUpdate ed = ac.getBean("employeeUpdate", EmployeeUpdate.class);
	ed.updateEmployee(100,"March");
	//System.out.println("100 emp_id dof is change to march");
	}
}
