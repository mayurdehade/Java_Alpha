//Program to print the Inverted And Rotated Half Paramid
package org.alpha.advance;

import java.util.Scanner;

public class InvertedAndRotatedHalfParamid {

	public static void inPara(int n) {
		for(int i=1; i<=n; i++) {
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			//stars
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		inPara(n);
		

	}

}
