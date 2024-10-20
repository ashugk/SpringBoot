package com.ashu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashu.model.Employee;

@Repository("empDAO")
public class IEmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMP_BY_LASTNAME = "SELECT EMP_NO, BIRTH_DATE, FIRST_NAME, LAST_NAME, GENDER, HIRE_DATE FROM EMPLOYEES "
			+ "WHERE LAST_NAME=(?) ORDER BY HIRE_DATE ";

	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeeByLastName(String lastName) throws Exception {
		// TODO Auto-generated method stub
		List<Employee> list= null;
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_EMP_BY_LASTNAME) )//try with resource
{
	ps.setString(1, lastName);
	try(ResultSet rs = ps.executeQuery())
	{
		list= new ArrayList<>();
		while(rs.next()) 
		{
			Employee emp = new Employee();
			emp.setEmpNo(rs.getInt(1));
			emp.setBirthDate(rs.getDate(2));
			emp.setFirstName(rs.getString(3));
			emp.setLastName(rs.getString(4));
			emp.setGender(rs.getString(5));
			emp.setHiredate(rs.getDate(6));
			list.add(emp);
		}
	}
	}catch(SQLException sqex) 
	{
		sqex.printStackTrace();
		throw sqex;
	}
	catch(Exception e) 
	{
		e.printStackTrace();
		throw e;
	}
		return list;
	}

}
