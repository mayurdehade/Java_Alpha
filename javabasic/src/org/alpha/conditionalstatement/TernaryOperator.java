//Program to demonstrate the ternary operator
package org.alpha.conditionalstatement;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt();
		
		String result = (n%2==0)?"Even":"Odd";
		
		System.out.println(n+" is: "+result);

	}

}
