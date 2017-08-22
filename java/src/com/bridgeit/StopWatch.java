package com.bridgeit;

import com.bridgeit.utility.Utility;

public class StopWatch {
	static int Choice = 0;

	public static void main(String[] args) {
		Utility utility = new Utility();

		do {
			System.out.println("Press '1' to Start Time: ");
			utility.inputInteger();
			utility.start();

			System.out.println("Press '2' to Stop Time: ");
			utility.inputInteger();
			utility.stop();

			long l = utility.getElapsedTime();
			System.out.println("elapsed time in milliseconds : " + l);
			System.out.println("elaspsed time in seconds : " + (l / 1000) + " sec");

			// Logic for continue the programme
			System.out.println("press 3 for continue");
			Choice = utility.inputInteger();
		} while (Choice == 3);
	}
}
