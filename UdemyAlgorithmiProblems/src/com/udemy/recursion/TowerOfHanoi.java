package com.udemy.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		solveTowerOfHanoi(4, 'A', 'B', 'C');

	}

	private static void solveTowerOfHanoi(int n, char rodFrom, char rodAuxillary, char rodTo) {
		if(n == 1) {
			System.out.println("Plate 1 from " + rodFrom+" to " + rodTo);
			return;
		}
		
		solveTowerOfHanoi(n - 1, rodFrom, rodTo, rodAuxillary);
		System.out.println("Plate " + n + " from " + rodFrom + " to " + rodTo);
		solveTowerOfHanoi(n - 1, rodAuxillary, rodFrom, rodTo);
	}
}
