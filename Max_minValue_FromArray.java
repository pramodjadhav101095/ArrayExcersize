package com.prowing.ArrayExercise;

public class Max_minValue_FromArray {

	public static void main(String[] args) {
		int[]ar= {12,13,15,16,34,45,12};
		maxElement(ar);

	}

	public static void maxElement(int[] ar) {
		int min =ar[0];
		int max = ar[0];
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]>max) {
				max=ar[i];
			}
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		System.out.println("Largest number from given array is = " + max);
		System.out.println("Largest number from given array is = " + min);
	}


	
}
