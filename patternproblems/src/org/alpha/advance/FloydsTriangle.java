//Program to print Floyd's Triangle
package org.alpha.advance;

import java.util.Scanner;

public class FloydsTriangle {
	
	public static void floydsTri(int n) {
		int counter=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		floydsTri(n);

	}

}
