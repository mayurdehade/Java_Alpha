//Program to demonstrate the continue statement
package org.alpha.controlstatement;

public class ContinueStatement {

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++) {
			if(i==3) //3 is skip
				continue; //if condition is true the after continue the statement no executed 
			System.out.println(i);
		}
		System.out.println("Outer statement");

	}

}
