package com.new1.questions;

public class ques_13 {

	public static void main(String[] args) {
		
		int num = 12;
		
		double sum = 0;
		
		for(int i = 1; i <= num; i++) {
			
			System.out.println("1/"+i);
			
			sum = sum + (double)1/i;
		}
		System.out.println("Sum = "+sum); 
	}
}
