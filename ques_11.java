package com.new1.questions;

public class ques_11 {

	public static void main(String[] args) {

		int num = 7;

		int count = 0;

		for (int x = 2; x < num; x++) {

			if (num % x == 0)
				count++;
		}
		if (count == 0) {
			System.out.println("Yes, Prime Number");
		} else {
			System.out.println("Not, Prime Number");
		}
	}
}
