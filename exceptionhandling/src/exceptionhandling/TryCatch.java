//Exception Handling -> Exception handling is the handling the errors which occurs due to incorrect input from user.
//Exception: Exception is the event that occurs when a program is executed disrupting the normal flow of instructions.
package exceptionhandling;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		//simple try and catch block
		//try -> try contains the statement which may cause the exception (try to execute statement that may contain exception)
		//catch -> catch block catch the exception. There is have multiple catch blocks
		try {
			System.out.println(10/n);
		}
		//This block catch the all exception (main class)
		catch(Exception e) {
			System.out.println("Common block "+e);
		}

	}

}
