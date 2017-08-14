package com.bridgeit;


import com.bridgeit.MyStack;
import com.bridgeit.utility.Utility;

public class Parentheses {
	public static void main(String[] args) {
		int choice = 0;

		do {
			//intializing MyStake class
			MyStack<Character> parenthesesSatck = new MyStack<Character>();
			
			Utility utility = new Utility();
			System.out.print("Enter equation to check: ");
			String equation = utility.inputString();        //taking input
			char[] equationCharcaterArray = equation.toCharArray();

			//enhanced for loop and 
			for (char character : equationCharcaterArray) {
				if (character == '(') {
					parenthesesSatck.push(character);
				} else if (character == ')') {
					parenthesesSatck.pop();
				}
			}

			if (parenthesesSatck.isEmpty()) {
				System.out.println("Equation is balanced.");
			} else {
				System.out.println("Enquation is not balanced.");
			}

			// Logic for continue the programme
			Utility ul1 = new Utility();
			System.out.println("press 1 for continue");
			choice = ul1.inputInteger();
		} while (choice == 1);
	}

}
