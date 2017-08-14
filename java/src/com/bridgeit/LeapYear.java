package com.bridgeit;

/**
 * Date 07/08/2017 Purpose:check whether it is a Leap Year or not.
 **/
import com.bridgeit.utility.Utility;
public class LeapYear {

	public static void main(String[] args) {
		int choice = 0;

		do {
			Utility ul = new Utility();
			System.out.println("Enter a Year : ");
			int year = ul.inputInteger();

			boolean leap = Utility.leapYear(year);
			if (leap) {

				System.out.println("Year " + year + " is leap year : ");
			} else {
				System.out.println("Year " + year + " is not leap year : ");
			}
			// Logic for continue the programme
			Utility ul1 = new Utility();
			System.out.println("press 1 for continue");
			choice = ul1.inputInteger();
		} while (choice == 1);
	}
}