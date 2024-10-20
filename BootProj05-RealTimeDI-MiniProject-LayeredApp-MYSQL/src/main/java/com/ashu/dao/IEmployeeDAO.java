package com.ashu.dao;

import java.util.List;

import com.ashu.model.Employee;

public interface IEmployeeDAO {
	
	public List<Employee> getEmployeeByLastName(String lastName)throws Exception;

}
