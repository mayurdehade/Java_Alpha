package org.alpha.array;

public class SubArrays {

	public static void printSubarrays(int numbers[]) {
		int ts=0;
		//start
		for(int i=0; i<numbers.length; i++) {
			//end
			for(int j=i; j<numbers.length; j++) {
				//printing all the elements between start and end
				for(int k=i; k<=j; k++) {
					System.out.print(numbers[k]+" ");
				}
				ts++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total Subarrays is "+ts);
	}
	
	public static void main(String[] args) {
		int nums[] = {2,4,6,8,10};
		printSubarrays(nums);

	}

}
