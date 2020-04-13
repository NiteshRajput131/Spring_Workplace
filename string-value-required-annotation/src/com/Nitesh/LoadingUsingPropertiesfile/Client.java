package com.Nitesh.LoadingUsingPropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans file is loading..");
		Student stud = context.getBean("student", Student.class);
		stud.StudentDisplay();

	}

}
