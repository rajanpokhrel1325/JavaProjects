package org.spring.database.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.TimeZone;


import org.springframework.stereotype.Component;
@Component
public class EmployeeDelete {
	
	public void deleteEmployee(int id)
	{
		//Employee emp ;
		String urldb= "jdbc:mysql://localhost:3306/First_Schema?serverTimezone=" + TimeZone.getDefault().getID();
		String usernam="root";
		String passwd = "G4z4EyRP";
		String query= "delete from Employee where Emp_id=?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(urldb,usernam, passwd);
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setInt(1, id);
			int i= ps.executeUpdate();
			System.out.println(i+"deleted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
