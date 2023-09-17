//Program to calculate the sum of the sub array
package org.alpha.array;

public class SubArraySum {

	public static void subArraySum(int nums[]) {
		int ts=0;
		for(int i=0; i<nums.length; i++) {
			for(int j=i; j<nums.length; j++) {
				int sum=0;
				for(int k=i; k<=j; k++) {
					sum+=nums[k];
				}
				ts++;
				System.out.print(sum+" ");
			}
			System.out.println();
		}
		System.out.println("Total sub array is "+ts);
	}
	
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10};
		subArraySum(arr);

	}

}
