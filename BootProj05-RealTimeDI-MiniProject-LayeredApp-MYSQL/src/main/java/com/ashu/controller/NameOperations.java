package com.ashu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ashu.model.Employee;
import com.ashu.service.IEmployeeService;

@Controller("payroll")
public class NameOperations {
	
	@Autowired
	private IEmployeeService service;
	
	public List<Employee> showAllEmployee(String lastName) throws Exception
	{
		List<Employee> list = service.fetchAllEmployeesByLastName(lastName);
		return list;
	}

}
