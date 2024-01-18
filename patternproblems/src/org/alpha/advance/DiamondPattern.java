package org.alpha.advance;

import java.util.Scanner;

public class DiamondPattern {

	public static void diamond(int n) {
		for(int i=1; i<=n; i++) {
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			//stars
			for(int j=1; j<=(2*i-1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//second half (mirror image)
		for(int i=n; i>=1; i--) {
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			//stars
			for(int j=1; j<=(2*i-1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		diamond(n);

	}

}
