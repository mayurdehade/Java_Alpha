//Program to find given number is prime number or not
package org.alpha.problems;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i=2; i<n; i++) {
			if(n%i==0)
				isPrime = false;
		}
		
		if(isPrime)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not prime number");
	}

}
