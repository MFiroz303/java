package com.bridgeit;

/**
 * Date 07/08/2017
 *  Purpose:Convert to Binary Using toBinary function and perform
 *  i. Swap nibbles and find the new number.
 *  ii. Find the resultant number is the number is a power of 2.
 **/
import com.bridgeit.utility.Utility;

public class Binary {
	static int Choice = 0;

	public static void main(String[] args) {

		do {
			// Take input to convert
			System.out.print("Enter number to convert into binary: ");
			Utility utility = new Utility();
			// convert using toBinary function
			String binaryString = utility.toBinary(utility.inputInteger());
			System.out.println("Binary representation of the number: " + binaryString);

			// stores swapped binary nibbles
			int SwappedBinary = utility.swapNibbles(binaryString);
			System.out.println("Binary after swapping: " + SwappedBinary);

			// stores new integer
			int swappedBinaryInteger = utility.binaryToInteger(SwappedBinary);
			System.out.println("Number after swapping nibbles: " + swappedBinaryInteger);
			;

			// checks if number is power of two and prints
			if (utility.isPowerOfTwo(SwappedBinary)) {
				System.out.println("The number is power of two");
			} else {
				System.out.println("The number is not power of two");
			}

			// Logic for continue the programme
			System.out.println("press 1 for continue");
			Choice = utility.inputInteger();
		} while (Choice == 1);
	}
}
