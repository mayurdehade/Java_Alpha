package org.alpha.abstraction;

//abstract class
abstract class Animal {
	String color;
	
	//constructor of abstract class
	Animal(){
		color = "brown";
	}
	
	void eat() {
		System.out.println("Animal eats");
	}
	
	//abstract method (method without body)
	abstract void walk();
}

//child class
class Horse extends Animal{
	
	//Constructor
	Horse(){
		System.out.println("Horse constructor called...");
	}

	//Abstracted method
	@Override
	void walk() {
		System.out.println("Walks on 4 legs");
	}
	
	void changeColor() {
		color = "Black";
	}
	
}

class Chicken extends Animal{
	//abstracted method
	@Override
	void walk() {
		System.out.println("Walks on 2 legs");	
	}
	
	void changeColor() {
		color = "White";
	}
	
}


class Mustang extends Horse{
	Mustang(){
		System.out.println("Mustang Constructor called...");
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		
		Horse h = new Horse();
		h.eat();
		h.walk();
		System.out.println(h.color); 
		
		Chicken c = new Chicken();
		c.eat();
		c.walk();
		System.out.println(c.color);
		
		System.out.println("----------------------------");
		
		//creating the object of the mustang class
		Mustang m = new Mustang();
		//Horse (parent class) constructor called first
		//then child class constructor (mustang)
		
	}

}
