package com.Nitesh.di_obj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Exam exam = context.getBean("exam", Exam.class);
		exam.MathPaper();
		
		Exam2 exam2 = context.getBean("exam2",Exam2.class);
		exam2.Mathpaper();
	}

}
