//Program to demonstrate the Ternary Operators (? :)
package org.alpha.operators;

import java.util.Scanner;
public class TernaryOperatorDemo {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();

      //even or odd
      String result = (num%2==0)?"Number is Even":"Number is Odd";
      System.out.println(result);
  }
}