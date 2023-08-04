//Print the number of digit in the number
package org.alpha.loops;

import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		int count=0;
		do {
			n=n/10;
			count++;
		} while(n>0);
		
		System.out.println("Number of digit is: "+count);

	}

}
