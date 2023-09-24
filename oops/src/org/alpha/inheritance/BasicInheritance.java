package org.alpha.inheritance;

public class BasicInheritance {

	public static void main(String[] args) {
		Fish f = new Fish();
		//calling the methods
		f.breathe();
		f.swim();


	}

}

//Parent or Base class
class Animal{
	String color;
	
	void eat() {
		System.out.println("Eats");
	}
	
	void breathe(){
		System.out.println("Breathe");
	}
}

//Child or Derived class
class Fish extends Animal{
	int fins;
	
	void swim() {
		System.out.println("fish can swim");
	}
}
