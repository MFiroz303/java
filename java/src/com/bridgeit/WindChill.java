package com.bridgeit;

/**
 * Date 07/08/2017 Purpose:Write a program WindChill to takes two double
 * command-line arguments t and v and prints the wind chill
 **/
import com.bridgeit.utility.Utility;

public class WindChill {
	public static void main(String[] args) {
		int choice = 0;

		do {
			Utility u = new Utility();
			u.calculateWindChill();
			// Logic for continue the programme
			Utility ul1 = new Utility();
			System.out.println("press 1 for continue");
			choice = ul1.inputInteger();
		} while (choice == 1);
	}
}