package org.alpha.conditionalstatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		float a = sc.nextFloat();
		System.out.println("Enter the second number: ");
		float b = sc.nextFloat();
		System.out.println("Enter the operator: ");
		char op = sc.next().charAt(0);
		
		switch(op) 
		{
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				System.out.println(a/b);
				break;
			case '%':
				System.out.println(a%b);
				break;
			default:
				System.out.println("You are not entered the correct operator!");
		}

	}

}
