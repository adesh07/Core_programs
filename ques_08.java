package com.new1.questions;

public class ques_08 {

	public static void main(String[] args) {
		
		int[][] pahadha = new int[11][11];
		
		for(int x = 0; x < pahadha.length; x++) {
			
			for(int z = 0; z < pahadha.length; z++) {
				
				pahadha[x][z] = x * z; 
			}
		}
		for(int[] wkwk : pahadha) {
			
			for(int yoyo : wkwk) {
				
				System.out.print(yoyo+"\t");
			}
			System.out.println();
		}
	}
}
