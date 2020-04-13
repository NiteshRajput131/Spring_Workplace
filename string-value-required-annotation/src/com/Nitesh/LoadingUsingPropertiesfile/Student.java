package com.Nitesh.LoadingUsingPropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	
	@Value("${student.name}")
	private String name;

	
	@Value("${student.course}")
	private String course;

	
	@Value("${student.fee}")
	private String fee;

	/*
	 * public void setName(String name) { this.name = name; } public void
	 * setCourse(String course) { this.course = course; } public void setFee(String
	 * fee) { this.fee = fee; }
	 */

	public void StudentDisplay() {
		System.out.println("Student name: " + name);
		System.out.println("Student Enroll course: " + course);
		System.out.println("Course fees: " + fee);
	}

}
