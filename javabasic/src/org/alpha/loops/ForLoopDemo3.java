//Reverse the given number and store it then print
package org.alpha.loops;

import java.util.Scanner;

public class ForLoopDemo3 {

	public static void main(String[] args) {
		int n, rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		for(n=sc.nextInt();n!=0;n=n/10) {
			rev = (rev*10)+(n%10);
		}
		
		System.out.println("Reverse number: "+rev);
	}

}
