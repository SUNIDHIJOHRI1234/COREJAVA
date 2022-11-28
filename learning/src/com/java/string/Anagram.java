package com.java.string;

public class Anagram {
	public static void main(String args[]) {
		String str = "uuuuzzzzzhhvvvvvabcdefgehekjkehegfedcbavvvvvhhzzzzzuuuu";
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == str.charAt(str.length() - j - 1)) {
				if (j == str.length() / 2) {
					System.out.println("condition is true");
				}
			} else {
				System.out.println("condition is not equal");
				break;
			}
		}
	}
}
