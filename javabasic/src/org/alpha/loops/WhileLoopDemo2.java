//Program to print the addition of first n numbers using while loop
package org.alpha.loops;

import java.util.Scanner;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int n = sc.nextInt();
		int sum=0;
		while(1<=n) {
			sum+=n;
			n--;
		}
		System.out.println("Sum is: "+sum);
	}

}