package com.new1.questions;

public class ques_16 {

	public static void main(String[] args) {

		int[] arr = { 18, 87, 123, 101, 98 };

		int num1 = 0;

		int num2 = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > num2) {

				num1 = num2;

				num2 = arr[i];

			} else if (num1 < arr[i] && arr[i] < num2) {

				num1 = arr[i];
			}
		}
		System.out.println("second largest number = " + num1);
	}
}