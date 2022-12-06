package com.bridgelabz.polymorphism;

//Parent class
public class Animal {

	public void walk() {
		System.out.println("Animal is walking");
	}

	public void eat() {
		System.out.println("Animal is eating");
	}

	// Overloading eat method to performed Compile type polymorphism
	public void eat(String dinner) {
		System.out.println("Animal is eating " + dinner);

	}

}
