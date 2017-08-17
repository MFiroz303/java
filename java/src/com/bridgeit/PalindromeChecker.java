package com.bridgeit;

import java.util.Scanner;

import com.bridgeit.Deque;
public class PalindromeChecker {
	public static void main(String[] args) {

		//To Take user input
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string to check for palindrome: ");
		// string to be checked for palindrome
		String stringToCheck = scanner.next();
		
		// class object
		PalindromeChecker checker = new PalindromeChecker();

		if (checker.checkPalindrome(stringToCheck)) { // palindrome
			System.out.println("Given string is a palindrome...");
		} else { // not a palindrome
			System.out.println("Given string is not a palindrome...");
		}scanner.close();
	}

	// checks if the string is palindrome 
	boolean checkPalindrome(String stringToCheck) {
		
		// dequeue to store characters in the string
		Deque<Character> myDeque = new Deque<Character>();
		
		// character array to store characters
		char[] stringCharacterArray = stringToCheck.toCharArray();

		//	adds characters to the front of the deque
		for (Character character : stringCharacterArray) {
			myDeque.addFront(character);
		}

		//	returns false if a character does not match
		for (char character : stringCharacterArray) {
			if (character != myDeque.removeFront()) {
				return false;
			}
		}
		return true;
	}
}
