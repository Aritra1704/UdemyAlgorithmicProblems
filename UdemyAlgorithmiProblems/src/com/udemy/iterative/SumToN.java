package com.udemy.iterative;

public class SumToN {

	public static void main(String[] args) {
		System.out.println(sumIterative(4));

	}

	private static int sumIterative(int n) {
		int result = 0;
		for(int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}
}
