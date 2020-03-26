package com.Nitesh.di_obj;

public class Exam {

	private int stdid;
	private Mathcheat cheat1;
	
	public Exam() {
		System.out.println("Student 1 exam started..");
	}
	
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	

	public void setCheat1(Mathcheat cheat1) {
		this.cheat1 = cheat1;
	}

	public void MathPaper() {
		cheat1.Cheat();
		System.out.println("Student ID : "+stdid+"   Pass in Maths Exam..");
	}
}
