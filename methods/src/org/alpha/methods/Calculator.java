//Program of calculator using method overloading
//Method Overloading -> same name but different parameters
package org.alpha.methods;

public class Calculator {
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static float sum(float a, float b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		
		System.out.println(sum(22,32));// calling first method with int arguments
		System.out.println(sum(52.3f,50.45f)); //calling second method with float type arguments
		System.out.println(sum(10,20,30)); //calling third method with three int arguments
		

	}

}
