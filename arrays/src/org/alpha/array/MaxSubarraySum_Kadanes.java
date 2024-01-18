package org.alpha.array;

public class MaxSubarraySum_Kadanes {
	
	public static void kadanes(int numbers[]) {
		boolean isNegative = true;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>0) {
				isNegative = false;
			}
			if(numbers[i]>max) max = numbers[i];
		}
		if(isNegative) {
			System.out.println("Maximum subarray sum: "+max);
		}
		else {
			int curr_sum=0;
			int max_sum = Integer.MIN_VALUE;
			
			for(int i=0; i<numbers.length; i++) {
				curr_sum = curr_sum + numbers[i];
				if(curr_sum<0) curr_sum = 0;
				
				max_sum = Math.max(curr_sum, max_sum);
			}
			System.out.println("Maximum subarray sum: "+max_sum);
		}
	}

	public static void main(String[] args) {
//		int numbers[] = {1, -2, 6, -1, 3};
		int numbers[] = {-7,-5,-2,-1,-6,-8,-3};
		kadanes(numbers);

	}

}
