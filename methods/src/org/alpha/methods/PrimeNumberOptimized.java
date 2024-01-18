//Program to find the prime numbers using optimized way
//run the for loop from 2 to square root of n
package org.alpha.methods;

public class PrimeNumberOptimized {

	public static boolean isPrime(int n) {
		if(n==2) return true;
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPrime(51241));
	}

}
