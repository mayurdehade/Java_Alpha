//Program to demonstrate the Bitwise Operators
package org.alpha.operators;

public class BitwiseOperatorDemo {
  public static void main(String[] args){
      int a = 5, b = 7, c = 1;

      System.out.println(a&b); //5
      System.out.println(a|b); //7
      System.out.println(a^b); //xor -> 2

      System.out.println(a>>c); //right shift -> 2
      System.out.println(a<<c); //left shift -> 10
  }
}
