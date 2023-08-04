//Print character pattern
package org.alpha.basic;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
		
		//another is
		char ch = 'a';
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}
