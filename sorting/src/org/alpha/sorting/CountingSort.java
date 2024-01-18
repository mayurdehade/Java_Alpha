//Counting Sort
package org.alpha.sorting;

public class CountingSort {
	
	public static void counting_sort(int arr[]) {
		int largest = Integer.MIN_VALUE;
		for(int a:arr) {
			largest = Math.max(a, largest);
		}
		
		//count arr (freq)
		int count[] = new int[largest+1];
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		//sorting
		int j=0;
		for(int i=0; i<count.length; i++) {
			while(count[i]>0) {
				arr[j] = i;
				j++;
				count[i]--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {8,9,7,4,5,6,2,1,3,4,5,6,7,8,5};
		
		counting_sort(arr);
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
