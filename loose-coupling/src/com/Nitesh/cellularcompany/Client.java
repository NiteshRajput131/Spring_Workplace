package com.Nitesh.cellularcompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans file is loading..");
		Airtel airtel = context.getBean("airtel", Airtel.class);
		airtel.ActivateService();

	}

}
