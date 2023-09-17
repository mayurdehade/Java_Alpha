//Program to search key in array using binary search
//for binary search the array should be sorted
package org.alpha.array;

public class BinarySearch {
	
	public static int binary_search(int num[], int key) {
		int start = 0, end = num.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(num[mid]==key) {
				return mid; //element found and return index of that element
			}
			if(num[mid]<key) {
				start = mid+1; //if the element is num[mid] is less and key then update the start value as mid+1
				//because in the start to mid element not found it is greater
			}
			else {
				end = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = {1,2,3,5,6,8,9,10,13,14,15};
		int key = 8;
		System.out.println("Index is: "+binary_search(nums, key));

	}

}
