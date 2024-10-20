package com.ashu.service;

import java.util.List;

import com.ashu.model.Employee;

public interface IEmployeeService  {
	public List<Employee> fetchAllEmployeesByLastName(String lastName) throws Exception;

}
