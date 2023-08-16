//Write a method to print the sum of digits
package org.alpha.methods;

public class SumOfDigits {
	
	public static int sum(int n) {
		int sum=0;
		
		while(n!=0) {
			int s = n%10;
			n = n/10;
			sum+=s;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("sum is: "+sum(1000345600));

	}

}
