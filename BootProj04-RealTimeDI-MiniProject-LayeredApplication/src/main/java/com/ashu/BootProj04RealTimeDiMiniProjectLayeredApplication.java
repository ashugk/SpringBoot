package com.ashu;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashu.controller.EmployeeOperationsController;
import com.ashu.model.Employee;

@SpringBootApplication
public class BootProj04RealTimeDiMiniProjectLayeredApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj04RealTimeDiMiniProjectLayeredApplication.class, args);
		// get access to controller class object
		EmployeeOperationsController controller = ctx.getBean("empController",EmployeeOperationsController.class );
		// invoke the bussiness method
		try 
		{
			List<Employee> list = controller.showEmployeeByDesgn("MANAGER", "ANALYST", "SALESMAN");
			list.forEach(emp -> 
			{
				System.out.println(emp);
			});
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
