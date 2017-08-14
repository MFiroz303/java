package com.bridgeit;

/*

* Date: 07/08/2017
* Purpose: Computes the prime factorization for given number.
**/

import com.bridgeit.utility.Utility;

public class PrimeFactor {
	public static void main(String[] args) {
		Utility u = new Utility();

		System.out.println("Enter a integer number");
		int inputNumber = u.inputInteger();

		for (int i = 2; i <= inputNumber; i++) {
			if (u.isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}