package com.udemy.recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(4));

		System.out.println(factorialAccuulator(1, 4));
	}

	private static int factorial(int n) {
		if(n == 1) return 1;
		return n * factorial(n - 1);
	}
	
	private static int factorialAccuulator(int accumulator, int n) {
		if(n == 1) return accumulator;
		return factorialAccuulator(accumulator * n, n - 1);
	}
}
