//Give input form user until input number is not multiple of 10
package org.alpha.controlstatement;

import java.util.Scanner;

public class BreakStatement2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the number: ");
			int n = sc.nextInt();
			if(n%10==0)
				break;
			System.out.println("You entered number: "+n);
		}
		System.out.println("Loop is ended");
		

	}

}
