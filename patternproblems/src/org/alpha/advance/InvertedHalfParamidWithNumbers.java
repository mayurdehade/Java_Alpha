//Program to print the inverted half paramid with numbers
package org.alpha.advance;

import java.util.Scanner;

public class InvertedHalfParamidWithNumbers {

	public static void inParaNum(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		inParaNum(n);
	}

}
