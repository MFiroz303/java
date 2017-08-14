package com.bridgeit;

/**
 * Date 07/08/2017 Purpose: to find the roots of the equation a*x*x + b*x + c.
 **/
import com.bridgeit.utility.Utility;
public class QuadratiEq {
	public static void main(String[] args) {
		int choice = 0;

		do {
			Utility ul = new Utility();
			ul.findRoot();
			
			// Logic for continue the programme
			Utility ul1 = new Utility();
			System.out.println("press 1 for continue");
			choice = ul1.inputInteger();
		} while (choice == 1);
	}
}