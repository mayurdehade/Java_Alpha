//Reverse Array
package org.alpha.array;

public class ReverseArray {
	//Array is passed by reference in methods
	public static void reverse(int nums[]) {
		int start=0, end=nums.length-1;
		
		while(start<end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		reverse(arr);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
