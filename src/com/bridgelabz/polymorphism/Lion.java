package com.bridgelabz.polymorphism;

//Single level inheritance is performed with the Animal as parent class
//and Lion as Child class
public class Lion extends Animal {
	// Overriding methods of the parent class in the child class
	// Runtime polymorphism is performed by overriding the parent class
	@Override
	public void walk() {
		System.out.println("Lion is walking");
	}

	@Override
	public void eat() {
		System.out.println("Lion is eating");
	}

	@Override
	public void eat(String dinner) {
		System.out.println("Lion is eating " + dinner);

	}
}
