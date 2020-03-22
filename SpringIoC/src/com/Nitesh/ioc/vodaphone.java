package com.Nitesh.ioc;

public class vodaphone implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling by Vodaphone sim.");
		
	}

	@Override
	public void data() {
		System.out.println("Browing internet by Vodaphone sim.");
		
	}
	
		

}
