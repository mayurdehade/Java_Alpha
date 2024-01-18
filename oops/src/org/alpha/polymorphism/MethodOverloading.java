package org.alpha.polymorphism;

import java.util.Scanner;

class Calculator{
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public float sum(float a, float b) {
		return a+b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculator c = new Calculator();
		
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Sum is " + c.sum(a,b));
		
		System.out.println(c.sum(12, 33, 32));
		
		System.out.println(c.sum(15.2f, 45.25f));

	}

}
