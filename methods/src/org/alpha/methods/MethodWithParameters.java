//Method with Parameters
package org.alpha.methods;

import java.util.Scanner;

public class MethodWithParameters {
	
	public static int calculateSum(int a, int b) { //parameters
		return a+b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Sum: "+calculateSum(a,b)); //arguments
	}

}
