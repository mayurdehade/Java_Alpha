//Program to demonstrate Insertion sort
package org.alpha.sorting;

public class InsertionSort {

	public static void insertion_sort(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {
			int curr = arr[i];
			int prev = i-1;
			
			//finding out the correct position to insert element
			while(prev>=0 && arr[prev] > curr) {
				arr[prev+1] = arr[prev];
				prev--;
			}
			arr[prev+1] = curr;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {6,5,4,3,2,1};
		insertion_sort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}
