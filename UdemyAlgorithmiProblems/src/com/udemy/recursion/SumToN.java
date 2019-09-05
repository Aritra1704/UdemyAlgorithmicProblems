package com.udemy.recursion;

public class SumToN {

	public static void main(String[] args) {
		System.out.println(sumIterative(4));
		
		System.out.println(sumRecursive(4));

	}

	private static int sumRecursive(int n) {
		if(n == 1)
			return 1;
		return (n + sumRecursive(n - 1));
	}
	
	private static int sumIterative(int n) {
		int result = 0;
		for(int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}
}
