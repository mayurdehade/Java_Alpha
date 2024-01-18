//Program to demonstrate the break statement
package org.alpha.controlstatement;

public class BreakStatement {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			if(i==3)
				break;
			System.out.println(i);
			//print the number 1,2 then the execution is stop
		}
		
		System.out.println("Outer statement");

	}

}
