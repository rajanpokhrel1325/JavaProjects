package org.spring.database.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.TimeZone;


import org.springframework.stereotype.Component;
@Component
public class EmployeeUpdate {
	
	public void updateEmployee(int id,String month)
	{
		//Employee emp ;
		String urldb= "jdbc:mysql://localhost:3306/First_Schema?serverTimezone=" + TimeZone.getDefault().getID();
		String usernam="root";
		String passwd = "G4z4EyRP";
		String query= "update Employee set DOF=? where Emp_id=?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(urldb,usernam, passwd);
			PreparedStatement ps= connection.prepareStatement(query);
			ps.setString(1, month);
			ps.setInt(2, id);
			int i= ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
