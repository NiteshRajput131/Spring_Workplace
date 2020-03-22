package com.Nitesh.ioc;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class mobile {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
		
		/*Airtel air = context.getBean("airtel", Airtel.class);
		
		air.calling();
		air.data();*/
				
	}

}
