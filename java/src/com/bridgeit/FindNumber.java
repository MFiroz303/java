package com.bridgeit;

/**
 * Date 07/08/2017
 *  Purpose: takes a command-line argument N, asks you to think of a number
 *  Print the intermediary number and the final answer
 **/
import com.bridgeit.utility.Utility;

public class FindNumber {
	public static void main(String[] args) {
		int choice = 0;

		do {
			Utility ul = new Utility();
			System.out.println("Enter the Range");
			int inputNumber = ul.inputInteger();

			// creating an array and pass the inputed number
			int array[] = new int[inputNumber];
			for (int i = 0; i < array.length; i++) {
				array[i] = i;
				System.out.print(array[i] + " ");
			}
			System.out.println();
			ul.findNumber(0, inputNumber);

			// Logic for continue the programme
			Utility ul1 = new Utility();
			System.out.println("press 1 for continue");
			choice = ul1.inputInteger();
		} while (choice == 1);
	} // end of main method
} // end of class
