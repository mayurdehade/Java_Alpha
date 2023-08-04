package org.alpha.basic;

import java.util.Scanner;

public class InvertedStartPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		int i=0; 
		while(i<n) {
			int j=n-i;
			while(j>0) {
				System.out.print("* ");
				j--;
			}
			System.out.println();
			i++;
		}

	}

}
