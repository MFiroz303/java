package com.bridgeit;

/**
 * Date 07/08/2017
 *  Purpose:Flip Coin and print percentage of Heads and Tails.
 **/
import com.bridgeit.utility.Utility;

public class FlipCoin {
	static int Choice = 0;
	public static void main(String[] args) {
		

		do {
			//Taking input
			Utility utility = new Utility();
			System.out.println("Enter a number");
			int inputNumber = utility.inputInteger();
			int heads = 0;

			//Using Math.random() method to get different random values
			for (int i = 0; i < inputNumber; i++) {
				double random = Math.random();
				if (random > 0.5) {
					System.out.println("Head ");
					heads++;
				} else {
					System.out.println("Tails");
				}
			}
			
			// To print percentage of heads and tails
			System.out.println("Percentage of heads : " + (double) 100 * heads / inputNumber);
			System.out.println("Percentage of tails :  " + ((double) 100 * (inputNumber - heads) / inputNumber));

			// Logic for continue the programme
			System.out.println("press 1 for continue");
			Choice = utility.inputInteger();
		} while (Choice == 1);

	} // end main method
} // end of class