//instanceof operator -> Conditional Operator 
package org.alpha.instanceofdemo;

public class Dog extends Animal {

	public static void main(String[] args) {
		//instanceof operator use to test whether the object is instance of
		//specified type. It return true or false
		//if the object is belongs to specified class then it return true otherwise it return false
		//If we apply instanceof operator with a variable that have null value, it returns false.

		
		Dog d = new Dog();
		
		System.out.println(d instanceof Animal); //it return true
		
		Dog a = null;
		int b = 22;
		System.out.println(a instanceof Dog); //return false
		System.out.println(a instanceof Animal); //return false (because of null)
		
	}

}
