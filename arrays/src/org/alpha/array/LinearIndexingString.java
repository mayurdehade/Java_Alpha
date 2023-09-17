//Program to find the index of the given string in string array
package org.alpha.array;

public class LinearIndexingString {
	
	public static int find_str(String arr[], String key) {
		for(int i=0; i<arr.length; i++) {
			if(key.equals(arr[i])) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//Declare and initialize array
		String str[] = {"dosa", "pani puri", "pav vada", "idli", "samosa"};
		String key = "samosa";
		System.out.println("Index of key is: "+find_str(str,key));

	}

}
