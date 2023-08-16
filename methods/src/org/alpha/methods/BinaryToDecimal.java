//Program to convert Binary number to Decimal 
package org.alpha.methods;

public class BinaryToDecimal {
	
	public static int decimal(int bin) {
		int dec=0, pow=0;
		while(bin > 0) {
			int lastDigit = bin%10;
			dec = dec + lastDigit * (int)Math.pow(2,pow);
			pow++;
			bin/=10;
		}
		return dec;
	}

	public static void main(String[] args) {
		int dec = 1001;
		System.out.println("Decimal of "+dec+" is "+decimal(dec));

	}

}
