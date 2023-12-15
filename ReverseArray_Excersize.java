package com.prowing.ArrayExercise;

import java.util.Arrays;

public class ReverseArray_Excersize {

	public static void main(String[] args) {
		
		int []ar = {1,3,3,4,5,6};
		revesre(ar);

	}

	public static int[] revesre(int[] ar) {
		System.out.println("Original Array =");
		for(int i=0;i<=ar.length;i++) {
		}
		System.out.println(Arrays.toString(ar));
		
		System.out.println("Reverse Array =");
		
		for(int i= ar.length-1;i>=0;i--) {
		
		System.out.println(ar[i]);
		}
		return ar;
		
		
	}

}
