//Program to print the Solid Rhombus Pattern
package org.alpha.advance;

import java.util.Scanner;

public class SolidRhombusPattern {
	
	public static void solidRhombus(int n) {
		for(int i=1; i<=n; i++) {
			//spaces
			for(int j=1; j<=n-i; j++) System.out.print("  ");
			//stars
			for(int j=1; j<=n; j++) System.out.print("* ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		solidRhombus(n);
		
	}

}
