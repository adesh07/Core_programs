package com.new1.questions;

public class ques_05 {

	public static void main(String[] args) {

		int num = 6991;
		int n = num;
		int sum = 0;
		int r;

		while (n > 0) {

			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		System.out.println("Reverse Number = " + sum);
	}
}
