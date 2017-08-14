package com.bridgeit;
import com.bridgeit.utility.Utility;
public class EDistance {
	public static void main(String[] args) {
		int choice = 0;

		do {
			Utility ul = new Utility();
			System.out.println("Enter x number :");
			int valueOfx = ul.inputInteger();

			System.out.println("Enter y number :");
			int valueOfy = ul.inputInteger();

			int powerofx = ul.powerFunction(valueOfx, 2);
			System.out.println("Power of number x is :" + powerofx);

			int powerofy = ul.powerFunction(valueOfy, 2);
			System.out.println("Power of number y is :" + powerofy);

			int distance = (powerofx + powerofy);
			System.out.println("Distance between two origin is  : " + Math.sqrt(distance));

			// Logic for continue the programme
			Utility ul1 = new Utility();
			System.out.println("press 1 for continue");
			choice = ul1.inputInteger();

		} while (choice == 1);
	}
}