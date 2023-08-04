//Cascaded if else demo
package org.alpha.conditionalstatement;

import java.util.Scanner;

public class CasecadedIfElseDemo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		
		if(n>0) {
			if(n%2==0) {
				System.out.println("Positive even number");
			}
			else {
				System.out.println("Positive odd number");
			}
		} else if(n<0) {
			if(n%2==0) {
				System.out.println("Negative even number");
			}else {
				System.out.println("Negative odd number");
			}
		}else {
			System.out.println("Number is not positive or negative it is Zero");
		}

	}

}
