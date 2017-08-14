package com.bridgeit;

/*
*Date: 8/08/2017
Purpose: To Print The Power Value of N number < 31.
**/
import com.bridgeit.utility.Utility;
public class PowerOf {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("Enter a integer number ");
		int inputNumber = u.inputInteger();

		if (inputNumber < 31) {
			for (int i = 0; i < inputNumber; i++) {
				int power = u.poworOfTwo(i);
				System.out.println("Power of 2^" + i + " is: " + power);
			}
		} else {
			System.out.println("Please enter the number between 0 - 31 ");
		}
	}
}