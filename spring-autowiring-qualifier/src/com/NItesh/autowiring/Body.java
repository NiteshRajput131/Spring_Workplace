package com.NItesh.autowiring;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
	public static void main(String[] args) {

		ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
		Human human = Context.getBean("human", Human.class);
		human.StartPumping();

	}

}
