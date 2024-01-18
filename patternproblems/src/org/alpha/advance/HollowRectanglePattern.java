//Program to print the Hollow Rectangle Pattern
package org.alpha.advance;

import java.util.Scanner;

public class HollowRectanglePattern {

	public static void hollow_rectangle(int row, int col) {
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(i==0 || i==row-1 || j==0 || j==col-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the number of cols: ");
		int col = sc.nextInt();
		hollow_rectangle(row,col);

	}

}
