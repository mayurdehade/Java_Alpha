//Program to get input number from user and print that number except the multiple of 10 (don't print)
package org.alpha.controlstatement;

import java.util.Scanner;

public class ContinueStatement2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the number: ");
			int n = sc.nextInt();
			if(n%10==0)
				continue;
			System.out.println("You entered number: "+n);
		}

	}

}
