//Program to demonstrate the Conditional Statements
package org.alpha.conditionalstatement;

import java.util.Scanner;

public class IfElseDemo {
  public static void main(String[] args){
	  
      //If Else -> If there is only two condition we have to satisfy then we use simple if else
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = sc.nextInt();

      if(num%2==0){
          System.out.println("Number is Even");
      } else{
          System.out.println("Number is Odd");
      }

      

  }



}
