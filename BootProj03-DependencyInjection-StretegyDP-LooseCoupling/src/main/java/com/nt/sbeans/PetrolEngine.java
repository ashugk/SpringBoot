package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine  implements IEngine{
	
	public PetrolEngine() 
	{
		System.out.println("Petrol Engine :: 0 param constructor ");
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Petrol engine starts");
		
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("Petrol engine stops");
		
	}

}
