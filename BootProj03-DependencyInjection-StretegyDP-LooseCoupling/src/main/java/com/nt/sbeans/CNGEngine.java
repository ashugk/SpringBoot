package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("cEngine")
public class CNGEngine implements IEngine {
	
	public CNGEngine() 
	{
		System.out.println("CNGEngine :: 0 param constructor");
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("CNGEngine.startEngine() :: 0- param constructor");

	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("CNGEngine.stopEngine() :: 0- param constructor");
	}

}
