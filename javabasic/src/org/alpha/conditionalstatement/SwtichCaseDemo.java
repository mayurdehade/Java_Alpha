/*
 * The if-else statement is used to choose between two options, 
 * but the switch case statement is used to choose between numerous options.
 */

package org.alpha.conditionalstatement;

import java.util.Scanner;

public class SwtichCaseDemo {

	public static void main(String[] args) {
		//user input
		Scanner sc = new Scanner(System.in);
		
		//Switch Case -> it is used to choose between numerous options
	      System.out.println("Enter a number 1-10: ");
	      int num2 = sc.nextInt();

	      switch (num2){
	          case 1:
	              System.out.println("One");
	              break;
	          case 2:
	              System.out.println("Two");
	              break;
	          case 3:
	              System.out.println("Three");
	              break;
	          case 4:
	              System.out.println("Four");
	              break;
	          case 5:
	              System.out.println("Five");
	              break;
	          case 6:
	              System.out.println("Six");
	              break;
	          case 7:
	              System.out.println("Seven");
	              break;
	          case 8:
	              System.out.println("Eight");
	              break;
	          case 9:
	              System.out.println("Nine");
	              break;
	          case 10:
	              System.out.println("Ten");
	              break;
	          default:
	              System.out.println("You entered incorrect number");
	      }
	       

	}

}
