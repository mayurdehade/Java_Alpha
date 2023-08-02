//Program to demonstrate the Arithmetic Operators and Increment and Decrement Operators
package org.alpha.operators;

import java.util.Scanner;
public class ArithmeticOperatorDemo {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter two numbers: ");
      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println("Addition: " + (a+b));
      System.out.println("Substraction: " + (a-b));
      System.out.println("Multiplication: " + (a*b));
      System.out.println("Division: " + (a/b));
      System.out.println("Modulo: " + (a%b));

      //Pre and Post Increment
      System.out.println("Value of a: " + a + " After the ++a (pre) " + (++a)); //pre
      System.out.println("Value of a: " + a + " After the a++ (post) " + (a++)); //post


      //Pre and post
      System.out.println("Value of a: " + a + " After the --a (pre) " + (--a)); //pre
      System.out.println("Value of a: " + a + " After the --a (post) " + (++a)); //post

  }
}
