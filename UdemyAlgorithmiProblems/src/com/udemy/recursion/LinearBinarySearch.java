package com.udemy.recursion;

public class LinearBinarySearch {
	private static int[] array;
	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 8, 9 , 10, -3};
		array = arr;
		System.out.println(linearSearch(10));
		
		int[] arr1 = {1, 3, 4, 5, 7, 8, 9, 10};
		array = arr1;
		System.out.println(binarySearch(10));
	}
	
	public static int linearSearch(int item) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == item)
				return i;
		}
		
		return -1;
	}
	
	private static int binarySearch(int item) {
		return binarySearch(0, array.length + 1, item);
	}
	
	private static int binarySearch(int start, int end, int item) {
		if(end < start) {
			System.out.println("Item is not present in the array!!");
			return -1;
		} 
		
		int middle = (start + end)/2;
		if(middle >= array.length || middle < 0) {
			System.out.println("Item is not present in the array!!");
			return -1;
		}
			
		if(item == array[middle])
			return middle;
		else if (item < array[middle])
			return binarySearch(start, middle - 1, item);
		else
			return binarySearch(middle + 1, end, item);
	}

}
