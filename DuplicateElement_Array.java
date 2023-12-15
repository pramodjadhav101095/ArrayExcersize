package com.prowing.ArrayExercise;

public class DuplicateElement_Array {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 3, 2, 6, 8 };
		duplicate(ar);
	}

	public static int[] duplicate(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			
			for (int j = i + 1; j < ar.length; j++) {
				
				if (ar[i] == ar[j]) {
                 System.out.println( ar[j]);
			}
				
			}
		}
		return ar;

	}
}