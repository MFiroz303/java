package com.bridgeit;

/**
 * Date 07/08/2017 Purpose:check whether it is a Leap Year or not.
 **/
import com.bridgeit.utility.Utility;
public class LeapYear {

	static int Choice = 0;
	public static void main(String[] args) {
		Utility utility = new Utility();

		do {
			//Taking input 
			System.out.println("Enter a Year : ");
			int year = utility.inputInteger();

			//calling leapYear method of utility class
			boolean leap = utility.leapYear(year);
			if (leap) {

				System.out.println("Year " + year + " is leap year : ");
			} else {
				System.out.println("Year " + year + " is not leap year : ");
			}
			// Logic for continue the programme
			Utility ul1 = new Utility();
			System.out.println("press 1 for continue");
			Choice = ul1.inputInteger();
		} while (Choice == 1);
	}
}