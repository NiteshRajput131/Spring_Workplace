package com.Nitesh.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class ScienceTeacher implements Teacher {

	
	@Override
	public void teach() {
		System.out.println("My name is rahul");
		System.out.println("I'm your Science teacher");

	}

}
