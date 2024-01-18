//Program to print the all prime numbers in range
package org.alpha.methods;

import java.util.Scanner;

public class PrimeInRange {
	
	public static boolean isPrime(int n) {
		if(n==2) return true;
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	public static void primeInRange(int n) {
		System.out.println("Prime Numbers: ");
		for(int i=2; i<=n; i++) {
			if(isPrime(i)) System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		primeInRange(a);
	}

}
