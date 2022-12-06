package com.bridgelabz.polymorphism;

public class AnimalMain {
	public static void main(String[] args) {
		// Creating object of the Lion class/child class
		// with the reference to the Animal class/parent class
		Animal animal = new Lion();
		animal.walk();
		animal.eat();
		animal.eat("meat");
	}
}
