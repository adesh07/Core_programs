package com.new1.questions;

public class ques_10 {

	public static void main(String[] args) {

		int num = 371;
		int n = num;
		int sum = 0;
		int r;

		while (n > 0) {

			r = n % 10;
			sum = sum + r * r * r;
			n = n / 10;
		}
		if (num == sum) {
			System.out.println("Yes, Armstrong Number");
		} else {
			System.out.println("Not Armstron Number");
		}
	}
}
