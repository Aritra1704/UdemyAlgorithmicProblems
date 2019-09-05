package com.udemy.recursion;

public class SumToN {

	public static void main(String[] args) {
		System.out.println(sumRecursive(4));

	}

	private static int sumRecursive(int n) {
		if(n == 1)
			return 1;
		return (n + sumRecursive(n - 1));
	}
}
