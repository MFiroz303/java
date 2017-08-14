package com.bridgeit;

/*
*Date: 8/08/2017
Purpose:Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal.
* Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results,
* and prints them out.
**/

import com.bridgeit.utility.Utility;
public class MyGabler {
	public static void main(String[] args) {
		int choice = 0;

		do {
			Utility ul = new Utility();
			System.out.println("Enter the $state");
			int $state = ul.inputInteger();

			System.out.println("Enter the $Goal");
			int $Goal = ul.inputInteger();

			System.out.println("Enter no. of times: ");
			int noOfTimes = ul.inputInteger();

			int beat = 0; // total number of beets mad
			int win = 0; // total number of games won

			for (int i = 0; i < noOfTimes; i++) {
				int sum = $state;
				while (sum > 0 && sum < $Goal) {
					beat++;
					if (Math.random() < 0.5) {
						sum++;
					} else {
						sum--;
					}
				}
				if (sum == $Goal) {
					win++;
				}
			}
			System.out.println(win + " wins of : " + noOfTimes);
			System.out.println("Percent of games won = " + 100.0 * win / noOfTimes);
			System.out.println("Avg  bets : = " + 1.0 * beat / noOfTimes);

			// Logic for continue the programme
			Utility ul1 = new Utility();
			System.out.println("press 1 for continue");
			choice = ul1.inputInteger();
		} while (choice == 1);
	}
}