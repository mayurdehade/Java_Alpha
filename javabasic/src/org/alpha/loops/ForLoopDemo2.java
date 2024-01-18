//Printing reverse of numbers
package org.alpha.loops;

import java.util.Scanner;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
//		n = sc.nextInt();
		
		for(n=sc.nextInt(); n!=0; n=n/10) {
			System.out.print(n%10);
		}

	}

}
