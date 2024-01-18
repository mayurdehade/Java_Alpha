//Program to demonstrate Selection Sort
package org.alpha.sorting;

public class SelectionSort {
	
	public static void selection_sort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			int minPos = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minPos]>arr[j]) {
					minPos = j;
				}
			}
			//Swapping
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = {9,5,2,3,4,1,0};
		selection_sort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}
