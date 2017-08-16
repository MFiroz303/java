package com.bridgeit;

import java.util.Scanner;
import com.bridgeit.utility.Utility;
public class BinaryBase2 {
	
	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number to convert into binary: ");
		int number =scanner.nextInt(); // number to convert into binary
		
		Utility utility = new Utility();
		// storing binary into string
		String binaryString = utility.toBinary(number);

		System.out.println("Binary representation of the number: " + binaryString);
		// prints padded string
		System.out.println("Addition: " + utility.paddedString(number));

	}

}
