package com.string;

import java.util.Scanner;

public class Repeatchar {

	static char arr[];

	public static boolean check(char ch) {
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == ch) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		String str = "Amit patel";
		str = str.toLowerCase();
		arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			int count = 0;
			if (check(ch)) {
				arr[i] = ch;

				for (int j = 0; j < str.length(); j++) {
					char c = str.charAt(j);

					if (ch == c) {
						count++;
					}

				}
				System.out.println(arr[i] + " " + count);
			}

		}
	}
}
