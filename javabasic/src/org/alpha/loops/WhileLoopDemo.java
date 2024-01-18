//Program to demonstrate the while loop
//Print 1 to n numbers using while loop
package org.alpha.loops;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int i=1;
		while(i<=n) {
			System.out.println(i+" ");
			i++;
		}

	}

}
