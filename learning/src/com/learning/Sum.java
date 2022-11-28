package com.learning;

public class Sum {
	public static void main(String args[]) {

		int a = 5, b = 2000;
		Sum s = new Sum();
		//System.out.println(s.add(a, b));
		System.out.println(s.addNumbers(b));
	
	}
	int add(int a, int b) {
		return b + a;
	}
	
	int addNumbers(int a) {
		int sum = 0;
		for (int j = 1; j <= a; j++) {
			sum = sum + j;
		}
		return sum;

	}
}
