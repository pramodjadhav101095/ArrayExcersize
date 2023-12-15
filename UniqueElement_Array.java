package com.prowing.ArrayExercise;

import java.util.Arrays;

public class UniqueElement_Array {

	public static void main(String[] args) {
		
		int[] ar = { 1,2,5,4,7,1,4};

		int[] result = uniqueNumeber(ar);
		System.out.println("elements in array are: " + Arrays.toString(ar));
		System.out.println("unique elements of array are: " + Arrays.toString(result));
	}
	private static int[] uniqueNumeber(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] == nums[j]) {
					nums[j] = nums[n - 1];
					n--;
					j--;
				}
			}
		}
		
		int[] result = Arrays.copyOf(nums, n);
		return result;
	}
}
