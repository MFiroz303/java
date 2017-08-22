package com.bridgeit;


import com.bridgeit.MyStack;
import com.bridgeit.utility.Utility;

public class Parentheses {
	static int Choice = 0;
	public static void main(String[] args) {
		Utility utility = new Utility();

		do {
			//intializing MyStake class
			MyStack<Character> parenthesesSatck = new MyStack<Character>();
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
			System.out.println("press 1 for continue");
			Choice = utility.inputInteger();
		} while (Choice == 1);
	}

}
