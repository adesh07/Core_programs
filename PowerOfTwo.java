package com.new1.questions;

public class PowerOfTwo {

	public static void main(String[] args) {

		int n = 2, temp = 0, power = 0;

		boolean t = false;

		while (n > temp) {
			
			power++;
			
			temp = (int) (Math.pow(2, power));

			if (temp == n)
				t = true;
		}
		if (t) {
			System.out.println("Yes, power of two : " + power);
		} 
		else {
			System.out.println("not a power of two");
		}
	}
}
