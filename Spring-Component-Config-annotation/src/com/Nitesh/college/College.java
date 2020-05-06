package com.Nitesh.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {

	@Value("${College.Name}")
	private String collegename;
	private Principal principal;
	private Teacher teacher;

	/*
	 * public College(Principal principal) { super(); this.principal = principal; }
	 */

	@Autowired
	@Qualifier("scienceTeacher")
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	@Required
	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	
	public void collegeInfo() {

		System.out.println("My college name is "+collegename );
		principal.principalInfo();
		teacher.teach();
	}

}
