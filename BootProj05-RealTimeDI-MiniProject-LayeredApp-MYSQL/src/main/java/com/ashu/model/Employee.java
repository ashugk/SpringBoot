package com.ashu.model;

import java.util.Date;

import lombok.Data;

@Data
public class Employee {

	private Integer empNo;
	private Date birthDate;
	private String firstName;
	private String lastName;
	private String gender;
	private Date hiredate;
	
	
}
