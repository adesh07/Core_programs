package com.new1.questions;

public class ques_12 {

	public static void main(String[] args) {

		int num = 10101;
		int n = num;
		int sum = 0;
		int r;

		while (n > 0) {

			r = n % 10;

			sum = sum * 10 + r;

			n = n / 10;
		}
		if (num == sum) {
			System.out.println("Yes, Number is Palindrome");
		} else {
			System.out.println("Not, Palindrome Number");
		}
	}
}
