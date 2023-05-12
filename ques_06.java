package com.new1.questions;

public class ques_06 {

	public static void main(String[] args) {

		int N = 12;
		int num1 = 0;
		int num2 = 1;

		System.out.println(num1 + "\n" + num2);

		for (int i = 0; i <= N; i++) {

			int num3 = num1 + num2;

			num1 = num2;

			num2 = num3;

			System.out.println(num3);
		}

	}
}
