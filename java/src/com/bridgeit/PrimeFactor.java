package com.bridgeit;

/*

* Date: 07/08/2017
* Purpose: Computes the prime factorization for given number.
**/

import com.bridgeit.utility.Utility;

public class PrimeFactor {
	static int Choice = 0;

	public static void main(String[] args) {
		Utility utility = new Utility();
		do {
			System.out.println("Enter a integer number");
			int inputNumber = utility.inputInteger(); // take the input

			// create a method to check prime factor
			for (int i = 2; i <= inputNumber; i++) {
				if (utility.isPrime(i)) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
			// Logic for continue the programme
			System.out.println("press 1 for continue");
			Choice = utility.inputInteger();
		} while (Choice == 1);
	}
}