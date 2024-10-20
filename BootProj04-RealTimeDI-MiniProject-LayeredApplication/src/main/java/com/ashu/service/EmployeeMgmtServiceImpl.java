package com.ashu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashu.dao.IEmployeeDAO;
import com.ashu.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO empDAO;

	@Override
	public List<Employee> fetchEmployeesByDesgn(String desgn1, String desgn2, String desgn3)  throws Exception{
		// TODO Auto-generated method stub
		
		List<Employee> list = empDAO.getEmployeesByDesgs(desgn1, desgn2, desgn3);
		/*
		 * list.forEach(emp ->{ // b logic to calculate goss salary
		 * emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.4));
		 * emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*0.2)); });
		 */
		return list;
	}

}
