package org.spring.database.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String getName(int id)
	{
		String Emp_name=jdbcTemplate.queryForObject("select Emp_name from Employee where Emp_id="+id, String.class);
		return Emp_name;
	}

}
