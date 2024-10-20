package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	public Vehicle() 
	{
		System.out.println("Vehicle class :: 0 param constructor");
	}

	@Autowired
//	@Qualifier("pEngine")
	private IEngine engine;
	
	public void journey(String startPlace, String destPlace)
	{
		System.out.println("Vehicle.journey()");
		engine.startEngine();
		System.out.println("Journey started from ::"+startPlace);
		System.out.println("Journey is going on ...");
		
		engine.stopEngine();
		System.out.println("Journey ended at::"+destPlace);
	}
}
