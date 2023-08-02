//Types casting and Type Conversion
package org.alpha.datatypes;

public class TypeConversion {
  public static void main(String[] args){
      //Type conversion is a automatic type conversion perform by java
      int c = 22;
      long d = c; //Implicit (Automatic) type conversion
      System.out.println(d);

      char ch = 'a';
      int number = ch; //convert to ASCII value
      System.out.println(number);

      //Type casting is a Explicit (forcefully) type conversion
      float x = 33.333f;
      int y = (int) 333.33f; //type casting
      int z = (int) x; //type casting

      System.out.println(x + " " + y + " " + z);

      //Type Promotion Expression -> Type promotion is performed when the expression is there
      char a = 'a';
      char b = 'b';
      System.out.println((int) a);
      System.out.println((int) b);
      System.out.println(a);
      System.out.println(b-a); //convert the char into ascii values and then the operation is performed
      System.out.println(a+b);

      //2
      int f = 20;
      long g = 29;
      double t = 40.33;
      float s = 33.232f;
      double ans = f + g + t + s;
      System.out.println(ans);
      System.out.println((int)(f + g + t + s)); //lossy conversion

      //this gives error
      byte l = 5;
//      byte ll = l * 2; //this gives error because here the l of byte is converted into int for perform calculation.
//      the int can't store into byte
      byte ls = (byte) (l*2); // this is right
      System.out.println(ls);

      int $ = 4;
      System.out.println($);

      int number$ = 33;

  }
}
