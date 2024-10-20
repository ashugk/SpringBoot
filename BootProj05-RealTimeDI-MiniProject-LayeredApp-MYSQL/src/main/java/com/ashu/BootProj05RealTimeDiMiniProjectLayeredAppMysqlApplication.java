package com.ashu;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashu.controller.NameOperations;
import com.ashu.model.Employee;

@SpringBootApplication
public class BootProj05RealTimeDiMiniProjectLayeredAppMysqlApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BootProj05RealTimeDiMiniProjectLayeredAppMysqlApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(BootProj05RealTimeDiMiniProjectLayeredAppMysqlApplication.class, args);
		NameOperations controller = ctx.getBean("payroll", NameOperations.class);
		
		try {
			List<Employee> list = controller.showAllEmployee("Facello");
			list.forEach(emp -> System.out.println(emp));
		}catch(Exception e) 
		{
			e.printStackTrace();
			//throw e;
		}
		((ConfigurableApplicationContext) ctx).close();
			
		
		}
	}

