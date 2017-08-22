package com.bridgeit;

/*
* Date 07/08/2017
* Purpose: Prints the Nth harMonic number: 1/1 + 1/2 + ... + 1/N
*/
import com.bridgeit.utility.Utility;

public class HarmonicNum {
	static int Choice = 0;
	public static void main(String[] args) {
	
		
		do {
			//Taking input
			Utility utility = new Utility();
			System.out.println("Enter Nth harmonic number : ");
			int enterNumber = utility.inputInteger();

			//To print Hramonic number of entered Number 
			double results = utility.harmonicNumber(enterNumber);
			if (enterNumber > 0) {
				System.out.println("The Harmonic Value for the number is : " + results);
			} else {
				System.out.println("The number should be greater than zero");
			}

			// Logic for continue the programme
			System.out.println("press 1 for continue");
			Choice = utility.inputInteger();
		} while (Choice == 1);
	}
}