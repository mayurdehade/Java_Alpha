//Program to calculate factorial using function
package org.alpha.methods;

public class Factorial {
	
	public static int fact(int a) {
		int ans=1;
		if(a<=1) {
			return ans;
		}
		else {
			for(int i=2; i<=a; i++) {
				ans*=i;
			}
			return ans;
		}
	}

	public static void main(String[] args) {
		
		int ans = fact(5);
		System.out.println("Factorial is: "+ans);

	}

}
