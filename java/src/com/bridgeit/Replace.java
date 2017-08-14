package com.bridgeit;

/*
*Date: 13/08/2017
Purpose: User Input and Replace String Template.
**/
import com.bridgeit.utility.Utility;
public class Replace {
	public static void main(String[] args) {
		int choice = 0;

		do {
			Utility ul = new Utility();
			System.out.println("Enter the Username : ");
			String userName = ul.inputString();

			String stringInput = "Hello <<username>> , How are you ?";
			if (userName.length() <= 3) {
				System.out.println(stringInput.replaceAll("<<username>>", userName));
			} else {
				System.out.println("Size does not exit");
			}
			// Logic for continue the programme
			Utility ul1 = new Utility();
			System.out.println("press 1 for continue");
			choice = ul1.inputInteger();
		} while (choice == 1);
	}
}