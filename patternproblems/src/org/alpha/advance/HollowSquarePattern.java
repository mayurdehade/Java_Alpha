//Program to print Hollow Rectangle Pattern
package org.alpha.advance;

import java.util.Scanner;

public class HollowSquarePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-2)
					System.out.print("* ");
				else
					if(j==0 || j==n-1)
						System.out.print("* ");
					else
						System.out.print("  ");
			}
			System.out.println();
		}

	}

}
