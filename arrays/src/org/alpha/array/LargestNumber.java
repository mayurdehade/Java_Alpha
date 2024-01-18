//Program to find the largest number in array
package org.alpha.array;

import java.util.Scanner;

public class LargestNumber {
	
	public static int largest_num(int nums[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++) {
			if(max<nums[i])
				max = nums[i];
		}
		return max;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n = sc.nextInt();
		int nums[] = new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Largest number is: "+largest_num(nums));
	}

}
