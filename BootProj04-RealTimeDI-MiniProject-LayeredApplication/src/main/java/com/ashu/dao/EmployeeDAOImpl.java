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
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String GET_EMP_BY_DESGN="SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE JOB IN(?, ?, ?) ORDER BY JOB";
	
	@Autowired
	DataSource ds;

	@Override
	public List<Employee> getEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list = null;
		try(// get pooled connection from DS
				Connection con = ds.getConnection();
				//create preprared statement using connection obj
				PreparedStatement ps = con.prepareStatement(GET_EMP_BY_DESGN);
				){// try with resource
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			try(//execute the SQL Query
					ResultSet rs = ps.executeQuery();
					){// nested try with resource 
				//initialize the array list
				list= new ArrayList<>();
				//process the resultset to copy its records List<Employee> obj
				while(rs.next()) 
				{
					//copy each record to Employee class obj
					Employee emp = new Employee();
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					//emp.setMgr(rs.getString(4));
					//emp.setHiredate(rs.getDate(5));
					emp.setSalary(rs.getDouble(4));
					//emp.setComm(rs.getInt(7));
					emp.setDepno(rs.getInt(5));
					
					//add employee calss oject to list collection
					list.add(emp);
				}//while
			}//try2
		}//try1
		catch(SQLException se) //handling known exception
		{
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {//handling unknow exceptions 
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}

}
