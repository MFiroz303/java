package com.bridgeit;

import com.bridgeit.utility.Utility;
public class PrimeNumber {
	public static void main(String[] args) {
		Utility u = new Utility();
		int n = 1000;

		for (int i = 1; i <= n; i++) {
			boolean status = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					status = false;
					break;
				}
			}
			if (status) {
				System.out.println(i + "");
			}
		}
	}
}
