package com.udemy.recursion;import java.awt.HeadlessException;

public class HouseBuilding {

	public static void main(String[] args) {
		buildLayerHeadRecur(4);
		buildLayerTailRecur(4);
	}

	private static void buildLayerHeadRecur(int height) {
		if(height == 0) return;
		buildLayerHeadRecur(height - 1);
		System.out.println(height);
	}
	
	private static void buildLayerTailRecur(int height) {
		if(height == 0) return;
		System.out.println(height);
		buildLayerTailRecur(height - 1);
		
	}
}
