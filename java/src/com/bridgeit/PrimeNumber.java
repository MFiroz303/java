package com.bridgeit;

import com.bridgeit.utility.Utility;

public class PrimeNumber {
	static int n = 1000;
	static int Choice = 0;

	public static void main(String[] args) {
		Utility utility = new Utility();
		
		do {
			for (int i = 1; i <= n; i++) {
				boolean status = true;

				//to check prime number
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						status = false;
						break;
					}
				}
				//To check status and print prime number
				if (status) {
					System.out.println(i + ""); 
				}
			}
			// Logic for continue the programme
			System.out.println("press 1 for continue");
			Choice = utility.inputInteger();
		} while (Choice == 1);
	}
}
