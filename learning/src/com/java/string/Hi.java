package com.java.string;

public class Hi {
	public static void main(String args[]) {
			String str = "Hi !!!!, how are you.?";
			System.out.println("str-! , . ? ");
			int expressions = 0;
			for (int j = 1; j < str.length(); j++) {
				if (str.charAt(j) == '!' || str.charAt(j) == ',' || str.charAt(j) == '.' || str.charAt(j) == '?') {
					expressions++;
				} 
			}
			System.out.println("expressions ::" + expressions);
		}
}
