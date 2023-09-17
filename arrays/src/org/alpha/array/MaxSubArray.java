//Program to calculate the max sum of the sub array
package org.alpha.array;

public class MaxSubArray {
	
	public static int maxsum(int nums[]) {
		int max = Integer.MIN_VALUE;
		int currentsum=0;
		for(int i=0; i<nums.length; i++) {
			for(int j=i; j<nums.length; j++) {
				currentsum=0;
				for(int k=i; k<=j; k++) {
					currentsum+=nums[k];
				}
				if(currentsum>max) {
					max=currentsum;
				}
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10};
		System.out.println("Max sum is:"+maxsum(arr));
	}

}
