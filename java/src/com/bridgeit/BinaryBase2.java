package com.bridgeit;

/**
 * Date 07/08/2017
 *  Purpose: Using toBinary function convert decimal to binary
 *  and decomposing the number into a sum of powers of 2
 **/
import java.util.Scanner;
import com.bridgeit.utility.Utility;

public class BinaryBase2 {

	public static void main(String[] args) {
		int choice = 0;

		do {
			//Take input 
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter number to convert into binary: ");
			int number = scanner.nextInt(); // number to convert into binary

			Utility utility = new Utility();
			// storing binary into string
			String binaryString = utility.toBinary(number);

			System.out.println("Binary representation of the number: " + binaryString);
			// prints padded string
			System.out.println("Addition: " + utility.paddedString(number));
			
			// Logic for continue the programme
			System.out.println("press 1 for continue");
			choice = scanner.nextInt();
		} while (choice == 1);
	}

}
