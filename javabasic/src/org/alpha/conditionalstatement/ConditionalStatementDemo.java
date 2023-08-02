//Program to demonstrate the Conditional Statements
package org.alpha.conditionalstatement;

import java.util.Scanner;

public class ConditionalStatementDemo {
  public static void main(String[] args){
      //If Else
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = sc.nextInt();

      if(num%2==0){
          System.out.println("Number is Even");
      } else{
          System.out.println("Number is Odd");
      }

      
      //Switch Case
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

      /*
      Enhanced switch:
      switch (num2) {
          case 1 -> System.out.println("One");
          case 2 -> System.out.println("Two");
          case 3 -> System.out.println("Three");
          case 4 -> System.out.println("Four");
          case 5 -> System.out.println("Five");
          case 6 -> System.out.println("Six");
          case 7 -> System.out.println("Seven");
          case 8 -> System.out.println("Eight");
          case 9 -> System.out.println("Nine");
          case 10 -> System.out.println("Ten");
          default -> System.out.println("You entered incorrect number");
       */

  }



}
