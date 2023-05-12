package com.new1.questions;

public class ques_07 {
	
	public static void main(String[] args) {
		
		int num = 7;
		int count = 0;
		int sum = 0;
		
		for(int i = 100; i <= 200; i++) {
			
			if(i % num == 0) {
				
				count = i;
				
				System.out.println(count);
				
				sum = sum + count;
			}
		}
		System.out.println("Sum = "+sum);
	}

}
