package com.bridgeit;

/*
*Date: 13/08/2017
Purpose: User Input and Replace String Template.
**/
import com.bridgeit.utility.Utility;

public class Replace {
	static int Choice = 0;

	public static void main(String[] args) {
		Utility utility = new Utility();

		do {

			System.out.println("Enter the Username : ");
			String userName = utility.inputString();

			String stringInput = "Hello <<username>> , How are you ?";
			if (userName.length() <= 3) {
				System.out.println(stringInput.replaceAll("<<username>>", userName));
			} else {
				System.out.println("Size does not exit");
			}
			// Logic for continue the programme
			System.out.println("press 1 for continue");
			Choice = utility.inputInteger();
		} while (Choice == 1);
	}
}