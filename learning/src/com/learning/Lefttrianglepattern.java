package com.learning;

public class Lefttrianglepattern {
	public static void main(String[] args) {

		/*
		 * for (int i = 1; i < 7; i++) { for (int k = 1; k <= 6-i; k++) {
		 * System.out.print(" "); } for (int j = 1; j <= i; j++) {
		 * System.out.print("*"); } System.out.println(""); }
		 */
		
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if(j>=7-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			} 
			System.out.println(" ");
		}
	}
}
