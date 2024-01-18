//Program to demonstrate the Assignment Operators +=, -=, *=, /=, %=
package org.alpha.operators;

public class AssignmentOperatorDemo {
  public static void main(String[] args){
      int a = 2;
      int b = 5;

      a += b;
      System.out.println(a);
      b -= a;
      System.out.println(b);
  }
}

