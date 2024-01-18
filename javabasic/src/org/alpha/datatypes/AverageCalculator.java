//Program to calculate the average of three numbers
package org.alpha.datatypes;

import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		System.out.println("Average is: "+(a+b+c)/3.00f);

	}

}
