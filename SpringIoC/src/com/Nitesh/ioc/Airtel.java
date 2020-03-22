package com.Nitesh.ioc;

public class Airtel implements Sim{
	
	
	@Override
	public void calling() {
		System.out.println("Calling by Airtel sim.");
		
	}

	@Override
	public void data() {
		System.out.println("Browing internet by Airtel sim.");
		
	}
	
		

}
