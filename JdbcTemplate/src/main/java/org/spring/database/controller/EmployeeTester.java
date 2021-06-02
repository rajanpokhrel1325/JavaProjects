package org.spring.database.controller;

import org.spring.database.util.DatabaseConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTester {
	public static void main(String[] args) {
	ApplicationContext ac=	new ClassPathXmlApplicationContext("configure.template.xml");
	
	DatabaseConnection databaseConnection= ac.getBean("databaseConnection", DatabaseConnection.class);
	String result=databaseConnection.getName(15);
	System.out.println("Employee name with ID 15 is: "+result);

	}
}
