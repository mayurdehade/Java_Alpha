//Program to demonstrate call by value
// Java supports call by value
package org.alpha.methods;

import java.util.Scanner;

public class Product {
	
	public static int multiply(int a, int b) {
		a = a*b;
		return a;// here the main a value is changed but in main function a value remain same this is called as call by value
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = multiply(a,b); //call by value (copy of variables is send to another method)
		System.out.println("Multiplication: "+ans);
		System.out.println("value of a is: "+a);
		
	}

}
