package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class BootProj03DependencyInjectionStretegyDpLooseCouplingApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BootProj03DependencyInjectionStretegyDpLooseCouplingApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(BootProj03DependencyInjectionStretegyDpLooseCouplingApplication.class, args);
		
		Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);
		vehicle.journey("Bangalore", "Hydrabad");
		((ConfigurableApplicationContext)ctx).close();
	}

}
