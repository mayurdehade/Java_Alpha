package org.alpha.sorting;

public class BubbleSort {
	
	public static void bubble_sort(int arr[]) {
		for(int turn=0; turn<arr.length-1; turn++) {
			for(int j=0; j<arr.length-turn-1; j++) {
				if(arr[j]>arr[j+1]) {
					//swap -> Time complexity Big O of n square	
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {5,6,5,4,7,8,9,2};
		bubble_sort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
