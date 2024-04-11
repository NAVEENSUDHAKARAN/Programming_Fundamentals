package com.chainsys.day4;

import java.util.Scanner;

public class ThirdPattern {

	public static void main(String[] args) {
		Scanner ThirdPattern = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int Number = ThirdPattern.nextInt();

		for (int i = 0; i < Number - 1; i += 1) {
			for (int j = 1; j <= i; j += 1) {
				System.out.print("$");
			}
			for (int j = i; j < Number - 1; j += 1) {
				if (i == j || j - i == 2) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}

			System.out.println();
		}
	}
}
