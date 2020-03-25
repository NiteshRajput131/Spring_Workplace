package com.Nitesh.di;

public class Student {

	private String studentname;
	private int id;
	
	
	/* CONSTRUCTOR INJECTION METHOD */
	public Student(String studentname, int id) {
		
		this.studentname = studentname;
		this.id = id;
	}


/*SETTER INJECTION METHOD*/
	 
	/*public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}*/


	void showinfo()
	{
		System.out.println("Student name : "+studentname+"  Student id : "+id);
	}
}
