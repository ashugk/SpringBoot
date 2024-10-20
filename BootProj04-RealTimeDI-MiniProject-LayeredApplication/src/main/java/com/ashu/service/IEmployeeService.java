package com.ashu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashu.model.Employee;


public interface IEmployeeService {
	
	public List<Employee> fetchEmployeesByDesgn(String desgn1, String desgn2, String desgn3) throws Exception;

}
