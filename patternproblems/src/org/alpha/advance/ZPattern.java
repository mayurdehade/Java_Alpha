//Program to print Z pattern
package org.alpha.advance;

import java.util.Scanner;

public class ZPattern {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			//print * for first and last line
			if(i==0 || i==n-1) {
				for(int j=0; j<n; j++) {
					System.out.print("*");
				}
			}
			//print spaces and star
			else if(i!=0 && i!=n-1)
			{
				//space
				for(int j=0; j<n-1-i; j++) {
					System.out.print(" ");
				}
				//star
				System.out.print("*");
			}
			//next line
			System.out.println();
		}
	}
}
