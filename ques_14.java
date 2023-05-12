package com.new1.questions;

public class ques_14 {

	public static void main(String[] args) {

		// Sum of Consecutive N Odd numbers

		int Odd = 15;

		int sum = 0;

		for (int i = 1; i <= Odd; i = i + 2) {

			System.out.println(i);

			sum = sum + i;
		}
		System.out.println("Sum of Odd = " + sum);

		// Sum of Consecutive N Even numbers

		int Even = 20;

		int sum1 = 0;

		for (int x = 2; x <= Even; x = x + 2) {

			System.out.println(x);

			sum1 = sum1 + x;
		}
		System.out.println("Sum of Even = " + sum1);
	}
}
