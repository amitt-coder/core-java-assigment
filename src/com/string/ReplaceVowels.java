package com.string;

import java.util.Scanner;

public class ReplaceVowels {

	public static void main(String[] args) {

		System.out.println("Enter a String");

		Scanner in = new Scanner(System.in);

		String str = in.next();

		char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			for (int j = 0; j < vowels.length; j++) {

				if (ch == vowels[j]) {
					ch = 'z';
				}
			}
			System.out.print(ch);
		}

	}
}
