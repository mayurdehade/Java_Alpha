//Program to print the Pairs of Array
package org.alpha.array;

public class PairsInArray {

	public static void pairs(int nums[]) {
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				System.out.print("("+i+","+j+")");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		pairs(arr);

	}

}
