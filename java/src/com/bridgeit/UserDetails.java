package com.bridgeit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.bridgeit.utility.Utility;

public class UserDetails {
	public String firstName; // first name of the user
	public String fullName; // last name
	public String contactNumber; // contact number
	String date; // date
	// standard message
	String message = "Hello <<name>>, We have your full " + "name as <<full name>> in our system. \nYour "
			+ "contact number is 91-xxxxxxxxxx." + " \nPlease,let us know in case of any"
			+ " clarification. \nThank you BridgeLabz 01/01/2016.";

	public static void main(String[] args) {

		UserDetails demo = new UserDetails(); // class object
		demo.start();
	}

	// Use required methods

	void start() {
		getName(); // get user information
		replace("<<name>>", firstName); // replace first name
		replace("<<full name>>", fullName); // replace last name
		replace("xxxxxxxxxx", contactNumber); // replace contact number
		replace("01/01/2016", date); // replace date
		System.out.println(message); // print updated message
	}

	// asks user to provide information and stores in respective variables
	void getName() {

		Utility ul = new Utility(); // To Take user input
		System.out.print("Enter your first name: ");
		firstName = ul.inputString();
		System.out.print("Enter your full name: ");
		fullName = ul.inputString();
		System.out.print("Enter your contact number: ");
		contactNumber = ul.inputString();
		System.out.print("Enter date in dd/mm/yyyy format: ");
		date = ul.inputString();

	}

	/**
	 * stringToBeReplaced replacement replaces string 'stringToBeReplaced' in
	 * message with given 'replacement'
	 */
	void replace(String stringToBeReplaced, String replacement) {
		Pattern pattern = Pattern.compile(stringToBeReplaced); // pattern
		Matcher matcher = pattern.matcher(message); // matcher
		message = matcher.replaceFirst(replacement);
	}
}