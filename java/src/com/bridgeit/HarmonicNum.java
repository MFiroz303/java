package com.bridgeit;

/*
* Date 07/08/2017
* Purpose: Prints the Nth harMonic number: 1/1 + 1/2 + ... + 1/N
*/
import com.bridgeit.utility.Utility;

public class HarmonicNum {
	public static void main(String[] args) {
		int choice = 0;

		do {
			Utility ul = new Utility();
			System.out.println("Enter Nth harmonic number : ");
			int enterNumber = ul.inputInteger();

			//To print Hramonic number of entered Number 
			double results = ul.harmonicNumber(enterNumber);
			if (enterNumber > 0) {
				System.out.println("The Harmonic Value for the number is : " + results);
			} else {
				System.out.println("The number should be greater than zero");
			}

			// Logic for continue the programme
			Utility ul1 = new Utility();
			System.out.println("press 1 for continue");
			choice = ul1.inputInteger();
		} while (choice == 1);
	}
}