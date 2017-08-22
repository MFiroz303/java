package com.bridgeit;

/**
 * Date 07/08/2017
 *  Purpose: takes a command-line argument N, asks you to think of a number
 *  Print the intermediary number and the final answer
 **/
import com.bridgeit.utility.Utility;

public class FindNumber {
	static int Choice = 0;
	public static void main(String[] args) {
		
		do {
			//Taking input
			Utility utility = new Utility();
			System.out.println("Enter the Range");
			int inputNumber = utility.inputInteger();

			// creating an array and pass the inputed number
			int array[] = new int[inputNumber];
			for (int i = 0; i < array.length; i++) {
				array[i] = i;
				System.out.print(array[i] + " ");
			}
			System.out.println();
			utility.findNumber(0, inputNumber);

			// Logic for continue the programme
			System.out.println("press 1 for continue");
			Choice = utility.inputInteger();
		} while (Choice == 1);
	} // end of main method
} // end of class
