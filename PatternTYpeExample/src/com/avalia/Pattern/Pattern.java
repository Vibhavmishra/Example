package com.avalia.Pattern;

public class Pattern {
	public static void main(String[] args) {
		int i, space, k = 0, count = 0, count1 = 0;
		for (i = 1; i <= 8; i++) {
			for (space = 1; space <= 8 - i; space++) {
				System.out.print(" ");
				count++;
			}

			while (k != 2 * i - 1) {
				if (count <= 8 - 1) {
					System.out.print(i + k);
					++count;
				} else {
					count1++;
					System.out.print((i + k - 2 * count1));
				}
				k++;
			}
			count1 = count = k = 0;
			System.out.println();
		}

	}
}