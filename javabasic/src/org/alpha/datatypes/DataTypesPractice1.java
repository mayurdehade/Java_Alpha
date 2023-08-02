//Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
//an eraser. You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% GST tax to the items in the bill as an advanced problem)
package org.alpha.datatypes;

import java.util.Scanner;
public class DataTypesPractice1 {

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the  cost of: ");
      System.out.println("Pencil: ");
      float pencil = sc.nextFloat();
      System.out.println("Pen: ");
      float pen = sc.nextFloat();
      System.out.println("Eraser: ");
      float eraser = sc.nextFloat();
      
      DataTypesPractice1 d = new DataTypesPractice1();
      System.out.println("The total bill is: " + d.cal(pencil, pen, eraser));

  }

  //method to calculate the price
  double cal(float a, float b, float c) {
      return ((a + b + c) + ((a + b + c) * 0.18));
  }
}