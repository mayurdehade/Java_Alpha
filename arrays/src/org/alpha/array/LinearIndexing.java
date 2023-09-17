//Program to find the index of the given key in array using linear search
package org.alpha.array;

public class LinearIndexing {
	
	public static int search_index(int nums[], int key) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		//Array declaration and initialization
		int nums[] = {1,2,5,4,6,8,9,7,5};
		
		int key = 9;
		System.out.println("Index is: "+search_index(nums,key));
		

	}

}
