package com.new1.questions;

public class ques_18 {

	public static void main(String[] args) {

		int[] a = { 7, 600, 5, 4, 3, 2, 1 };

		Position(a, 4);

		 //System.out.println(number + " : is at index = " + index);

	}

	private static int Position(int[] arr, int number) {

		int index = 0;

		for (int i = 0; i < arr.length; i++) {

			if (number == arr[i]) {

				index = i;

				break;

			} else if (number != arr[i]) {

				index = -1;
			}
		}

		System.out.println("\"" + number + "\"" + " is at index = " + index);

		return index;
	}
}
