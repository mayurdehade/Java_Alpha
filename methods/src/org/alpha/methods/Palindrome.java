//Program to find the given number is palindrome 
package org.alpha.methods;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(int n) {
		int palindrome=n, rev=0;
		while(palindrome>0) {
			int reminder = palindrome%10;
			rev = rev*10 + reminder;
			palindrome/=10;
		}
		if(rev==n) return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		if(isPalindrome(n))
			System.out.println("Number "+n+" is a palindrome");
		else
			System.out.println("Number "+n+" is not a palindrome");

	}

}
