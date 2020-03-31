package com.NItesh.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	Heart heart;
	
	public Human() {
	
	}

	
	public Human(Heart heart) {

		this.heart = heart;
	}

	@Autowired
	@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void StartPumping() {
		if (heart != null)
			{
			System.out.println("Animal name: "+ heart.getAnimalname()+" \n No. of heart: "+heart.getNoheart());
			heart.pump();
			}
		else
			System.out.println("You are dead ");

	}

}
