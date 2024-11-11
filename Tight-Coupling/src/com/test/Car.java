package com.test;

// car class tightly coupled with engine
public class Car extends Engine { // when we extend the property from one class to another then we can say its
									// IS-A relation ship
	public void drive() {
		int status = super.start();// with super we can extend data from parent class
		// Engine eng = new Engine() --- when we create an object then we can call its a
		// HAS-A relation ship
		// HAS- A also tight coupling when we make any changes in constructor.
		// if we create parameterized constructor then its affected

		if (status >= 1) {
			System.out.println("Journey started.....");
		} else {
			System.out.println("Engine having issue.....");
		}
	}
}
