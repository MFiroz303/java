package com.bridgeit;

import com.bridgeit.utility.Utility;

public class VendingMachine {
	public static void main(String[] args) {
		int choice = 0;

		do {
			Utility ul = new Utility();
			int[] notes = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };

			System.out.print("Enter the Amount:"); 
			int money = ul.inputInteger();         //take input
			
			//cal calculate method to print no of notes
			int total = ul.calculate(money, notes); 
			System.out.println("Total Number of Notes are :" + total);
			// Logic for continue the programme
			Utility ul1 = new Utility();
			System.out.println("press 1 for continue");
			choice = ul1.inputInteger();
		} while (choice == 1);
	}
}
