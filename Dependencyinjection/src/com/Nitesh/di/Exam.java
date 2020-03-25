package com.Nitesh.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("student",Student.class);
		Student student2 = context.getBean("student2",Student.class);
		
		student.showinfo();
		student2.showinfo();
		
	}

	

}
