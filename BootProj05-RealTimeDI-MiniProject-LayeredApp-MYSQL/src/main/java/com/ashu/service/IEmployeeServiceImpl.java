package com.ashu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashu.dao.IEmployeeDAO;
import com.ashu.model.Employee;

@Service("empService")
public class IEmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public List<Employee> fetchAllEmployeesByLastName(String lastName) throws Exception {
		// TODO Auto-generated method stub
		List<Employee> list = dao.getEmployeeByLastName(lastName);;
		return list;
	}

}
