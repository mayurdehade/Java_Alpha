package org.alpha.polymorphism;

//Base class
class Vehical{
	void run() {
		System.out.println("Vechical is running....");
	}
}

//Derived class
class Bike extends Vehical{
	//Override method
	void run() {
		System.out.println("Bike is running....");
		//calling the base class run
		super.run();
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		
		//calling the Bike class method
		b.run();
		

	}

}
