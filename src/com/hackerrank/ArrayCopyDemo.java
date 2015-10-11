package com.hackerrank;

public class ArrayCopyDemo {
	
	public static void main(String[] args) {
		int[] a = new int[]{8,7,3,5,19,23};
		int []b=new int[2];
		System.arraycopy(a, 0, b, 0, 2);
		printArray(b);
		
	}
	
	private static void printArray(int[] arr) {
		for(int a : arr){
			System.out.println(a);
		}
		
	}
}
