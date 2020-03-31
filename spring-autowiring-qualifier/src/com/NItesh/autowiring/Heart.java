package com.NItesh.autowiring;

public class Heart {

	private String animalname;
	private int noheart;

	public String getAnimalname() {
		return animalname;
	}

	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}

	public int getNoheart() {
		return noheart;
	}

	public void setNoheart(int noheart) {
		this.noheart = noheart;
	}

	public void pump() {

		System.out.println("Heart is pumping..");
		System.out.println("Alive ");
	}

}
