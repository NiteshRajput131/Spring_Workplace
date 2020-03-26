package com.Nitesh.di_obj;

public class Exam2 {
	
	
	  private int stdid2;
	 	private	Mathcheat cheat2 ;
	
	
	public Exam2() {
		System.out.println("Student 2 exam started..");
	}

	
	
	public void setStdid2(int stdid2) {
		this.stdid2 = stdid2;
	}


	public void setCheat2(Mathcheat cheat2) {
		this.cheat2 = cheat2;
	}


	public void Mathpaper() {
		cheat2.Cheat();
		System.out.println("Student Id: "+stdid2+" Pass in Math Exam");
	}
	
}
	
	
