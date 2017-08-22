package com.bridgeit;

import com.bridgeit.utility.Utility;

public class VendingMachine {
	static int Choice = 0;
	public static void main(String[] args) {
		Utility utility = new Utility();

		do {
			int[] notes = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };

			System.out.print("Enter the Amount:"); 
			int money = utility.inputInteger();         //take input
			
			//cal calculate method to print no of notes
			int total = utility.calculate(money, notes); 
			//System.out.println("Total Number of Notes are :" + total);
			// Logic for continue the programme
			System.out.println("press 1 for continue");
			Choice = utility.inputInteger();
		} while (Choice == 1);
	}
}
