package com.ashu.model;

import lombok.Data;

@Data
public class Employee {

	private Integer eno;
	private String ename;
	private String job;
	
	private Double salary;

	private Integer depno;
	//private Double grossSalary;
	//private Double netSalary;
	/*
	 * public Employee(Integer eno, String ename, String job, Double salary, Integer
	 * depno, Double grossSalary, Double netSalary) { super(); this.eno = eno;
	 * this.ename = ename; this.job = job; this.salary = salary; this.depno = depno;
	 * this.grossSalary = grossSalary; this.netSalary = netSalary; }
	 */
	
}
