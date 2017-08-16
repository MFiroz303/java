package com.bridgeit;

import java.util.Scanner;
import com.bridgeit.utility.Utility;

public class MergeSort {
	public static void main(String[] args) {
		int choice = 0;

		do {
			// Taking Inputed
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter number of strings: ");
			int numberOfStrings = scanner.nextInt();
			String[] strings = new String[numberOfStrings];

			for (int i = 0; i < numberOfStrings; i++) {
				strings[i] = scanner.next();
			}

			Utility ul = new Utility();
			strings = ul.mergeSort(strings);

			System.out.println("Sorted list:");

			// Using Enhanced for loop to print sorted list
			for (String string : strings) {
				System.out.println(string);
			}
			// Logic for continue the programme
			System.out.println("press 1 for continue");
			choice = ul.inputInteger();
		} while (choice == 1);
	}
}
