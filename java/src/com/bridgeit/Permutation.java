package com.bridgeit;

/**
 * Date 07/08/2017
 *  Purpose: To return all permutation of a String
 **/
import com.bridgeit.utility.Utility;

public class Permutation {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int choice = 0;

		do {
			System.out.println("Enter a String : ");
			String string = utility.inputString();//Taking input

			int lengthOfString = string.length(); //Taking input
			System.out.println();
			//call permute metho of utility class
			utility.permute(string, 0, lengthOfString - 1); 
			// Logic for continue the programme
			System.out.println("press 1 for continue");
			choice = utility.inputInteger();
		} while (choice == 1);
	}
}