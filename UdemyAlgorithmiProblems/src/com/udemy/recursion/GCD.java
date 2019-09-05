package com.udemy.recursion;

public class GCD {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 4;
		System.out.println(gcdIterative(num1, num2));

		System.out.println(gcdRecursive(num1, num2));
	}

	private static int gcdIterative(int num1, int num2) {
		while(num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}
	
	private static int gcdRecursive(int num1, int num2) {
		if(num2 == 0) return num1;
		return gcdRecursive(num2, num1 % num2);
	}
}
