package com.bridgeit;

/**
 * Date 07/08/2017
 *  Purpose: Using toBinary function convert decimal to binary
 *  and decomposing the number into a sum of powers of 2
 **/
import java.util.Scanner;
import com.bridgeit.utility.Utility;

public class BinaryBase2 {

	static int Choice = 0;

	public static void main(String[] args) {
		Utility utility = new Utility();
		do {
			// Take input
			System.out.print("Enter number to convert into binary: ");

			// number to convert into binary
			int number = utility.inputInteger();

			// storing binary into string
			String binaryString = utility.toBinary(number);

			System.out.println("Binary representation of the number: " + binaryString);
			// prints padded string
			System.out.println("Addition: " + utility.paddedString(number));

			// Logic for continue the programme
			System.out.println("press 1 for continue");
			Choice = utility.inputInteger();
		} while (Choice == 1);
	}

}
