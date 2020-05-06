package com.Nitesh.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MathTeacher implements Teacher {

	
	@Override
	public void teach() {
		System.out.println("My name is shikhar");
		System.out.println("I'm your math teacher");
		
	}
	
	

}
