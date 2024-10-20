package com.ashu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ashu.model.Employee;
import com.ashu.service.IEmployeeService;

@Controller("empController")
public class EmployeeOperationsController {
	
	@Autowired
	private IEmployeeService empService;
	
	public List<Employee> showEmployeeByDesgn(String desgn1, String desgn2, String desgn3) throws Exception
	{
		List<Employee> list = empService.fetchEmployeesByDesgn(desgn1, desgn2, desgn3);
		
		return list;
		
	}

}
