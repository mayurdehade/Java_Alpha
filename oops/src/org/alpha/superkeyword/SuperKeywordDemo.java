package org.alpha.superkeyword;

class Animal{
	Animal(){
		System.out.println("Animal constructor is called");
	}
	
	void display() {
		System.out.println("Aminal is not bird");
	}
}

class Horse extends Animal{
	Horse(){
		//parent class constructor is called
		//if super is not there then java compiler adds the super
		//keyword automatically for calling parent class constructor
		super();
		super.display(); //calling display method of parent class
		System.out.println("Horse constructor is called");
	}
}

public class SuperKeywordDemo {

	public static void main(String[] args) {
		Horse h = new Horse();

	}

}
