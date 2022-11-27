package com.kk.sj5.p1;

/*
 * Create a class 'Degree' having a method 'getDegree' that prints
 * "I got a degree". It has two subclasses namely 'Undergraduate' and
 * 'Postgraduate' each having a method with the same name that prints
 * "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the
 * method by creating an object of each of the three classes
 */

class Degree {
	public void getDegree() {
		System.out.println("i got a degree");
	}
}

class Undergraduate extends Degree {
	public void getDegree() {
		System.out.println("i am a underGraduate");
	}

}

class Postgraduate extends Degree {
	public void getDegree() {
		System.out.println("i am a PostGraduate");
		super.getDegree();

	}

}

public class ans {

	public static void main(String[] args) {
		Undergraduate a = new Undergraduate();
		Postgraduate b = new Postgraduate();
		a.getDegree();
		b.getDegree();

	}

//		

}
