package com.learning;

public class Loop {
	public static void main(String args[]) {

		int a = 5;
		int b = 8;
		//System.out.println(a + b);
		staticAdd(a, b);
			Loop sheena= new Loop();
			System.out.println("add "+sheena.add(a, b));
			System.out.println("sub "+sheena.sub(a, b));
			System.out.println("mul "+sheena.mul(a, b));
			System.out.println("div "+sheena.div(a, b));
			System.out.println("Mod "+sheena.mod(a, b));
			
			
			
	}
	static int staticAdd(int a, int b) {
		
		
		return b + a;
	}
	
	int sub(int a, int b) {
		return b - a;
	}
	int add(int a, int b) {
		return b + a;
	}
	int mul(int a, int b) {
		return b * a;
	}
	int div(int a, int b) {
		return b / a;
	}
	int mod(int a, int b) {
		return b % a;
	}
}
