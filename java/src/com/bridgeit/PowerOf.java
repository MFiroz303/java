package com.bridgeit;

/*
*Date: 8/08/2017
Purpose: To Print The Power Value of N number < 31.
**/
import com.bridgeit.utility.Utility;
public class PowerOf {
	static int Choice=0;
	public static void main(String[] args) {
		Utility utility = new Utility();
	 do{
		System.out.println("Enter a integer number ");
		int inputNumber = utility.inputInteger();

		if (inputNumber < 31) {
			for (int i = 1; i <=inputNumber; i++) {
				int power = utility.poworOfTwo(i);
				System.out.println("Power of 2^" + i + " is: " + power);
			}
		} else {
			System.out.println("Please enter the number between 0 - 31 ");
		}
		// Logic for continue the programme
		System.out.println("press 1 for continue");
		Choice = utility.inputInteger();
	} while (Choice == 1);
	}
}