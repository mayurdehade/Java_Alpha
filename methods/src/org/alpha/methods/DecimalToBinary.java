//Program to convert Decimal to Binary
package org.alpha.methods;

public class DecimalToBinary {
	
	public static int binary(int dec) {
		int rem=0, pow=0, bin=0;
		//converting the binary to decimal
		while(dec!=0) {
			rem = dec % 2;
			dec/=2;
			bin = bin + rem*(int)Math.pow(10, pow);
			pow++;
		}
		return bin;
	}

	public static void main(String[] args) {
		int dec = 10;
		System.out.println("Binary of "+dec+" is "+binary(dec));
	}

}
