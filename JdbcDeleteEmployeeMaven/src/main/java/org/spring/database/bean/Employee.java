package org.spring.database.bean;



public class Employee {
	private int Emp_id;
	private String Emp_name;
	private String Address;
	private String dof;
	
	public Employee() {}
	
	
	public Employee(int emp_id, String emp_name, String address, String dof) {
		Emp_id = emp_id;
		Emp_name = emp_name;
		Address = address;
		this.dof = dof;
	}

	public int getEmp_id() {
		return Emp_id;
	}
	
	public String getEmp_name() {
		return Emp_name;
	}
	public String getAddress() {
		return Address;
	}
	public String getDof() {
		return dof;
	}	

}
