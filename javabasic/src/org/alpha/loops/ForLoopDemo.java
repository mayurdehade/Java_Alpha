//Program to demonstrate the for loop
//Printing square * pattern
package org.alpha.loops;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		/* syntax:
		 * for(initialization; condition; updation)
		 * {
		 * 	//code
		 * }
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		//row
		for(int i=0; i<n; i++) {
			//col
			for(int j=0; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
