//Program to demonstrate the user input
package org.alpha.datatypes;

import java.util.Scanner;
public class UserInput {
  public static void main(String[] args){

      //creating the scanner class object
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a Character: ");
      char a = sc.next().charAt(0);
      System.out.println("You entered character : " + a);

      System.out.println("Enter two number: ");
      int x = sc.nextInt();
      int y = sc.nextInt();
      System.out.println("Sum of two numbers: "+(x+y));


  }
}
