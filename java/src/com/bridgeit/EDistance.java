package com.bridgeit;
import com.bridgeit.utility.Utility;
public class EDistance {
	static int Choice = 0;
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		do {
			//Taking input
			System.out.println("Enter x number :");
			int valueOfx = utility.inputInteger();

			System.out.println("Enter y number :");
			int valueOfy = utility.inputInteger();

			int powerofx = utility.powerFunction(valueOfx, 2);
			System.out.println("Power of number x is :" + powerofx);

			int powerofy = utility.powerFunction(valueOfy, 2);
			System.out.println("Power of number y is :" + powerofy);

			int distance = (powerofx + powerofy);
			System.out.println("Distance between two origin is  : " + Math.sqrt(distance));

			// Logic for continue the programme
			System.out.println("press 1 for continue");
			Choice = utility.inputInteger();
		} while (Choice == 1);
	}
}