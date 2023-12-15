package com.prowing.ArrayExercise;

public class SumOfArray {


	public int[] sum(int[] numbers) {
		int sum1 = 0;
		for (int i = 0; i <= numbers.length; i++) {

			sum1 = sum1 + i;

		}
		System.out.println(sum1);
		return numbers;

	}

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
		SumOfArray obj = new SumOfArray();
		obj.sum(numbers);

	}

}
