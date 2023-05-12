package com.new1.questions;

public class ques_15 {

	public static void main(String[] args) {

		int[] arr = { 18, 87, 23, 101, 98 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];
			}

		}
		System.out.println("Largest Number in the array = " + max);
	}
}