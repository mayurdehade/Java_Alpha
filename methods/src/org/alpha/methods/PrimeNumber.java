//Program to check the given number is prime or not
package org.alpha.methods;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int a) {
		if(a==2) {
			return true;
		}
		
		for(int i=2; i<a; i++) {
			if(a%i==0) return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		String ans = (isPrime(n))?"Prime Number":"Not Prime Number";
		System.out.println(ans);

	}

}
