//Max sub array sum using prefix array
package org.alpha.array;

public class MaxSubArrayPrefix {
	
	public static int prefixsum(int nums[]) {
		int currentsum=0, maxsum = Integer.MIN_VALUE;
		int prefix[] = new int[nums.length];
		
		//calculate the prefix array
		prefix[0] = nums[0];
		for(int i=1; i<nums.length; i++) {
			prefix[i] = nums[i]+prefix[i-1];
		}
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i; j<nums.length; j++) {
				currentsum = i==0? prefix[j] : prefix[j] - prefix[i-1];
				if(currentsum>maxsum) {
					maxsum=currentsum;
				}
			}
		}
		return maxsum;
	}

	public static void main(String[] args) {
		int arr[] = {1,-2,6,-1,3};
		System.out.println("Max sum of subarray is: "+prefixsum(arr));
	}

}
