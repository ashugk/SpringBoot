package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dEngine")
@Primary
public class DieselEngine implements IEngine {
	
	public DieselEngine() 
	{
		System.out.println("DieselEngine :: 0-param constructor");
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Disele engine starts ::");
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("Diesel Engine stops ");

	}

}
