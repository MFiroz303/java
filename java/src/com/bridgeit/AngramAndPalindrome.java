package com.bridgeit;

/**
 * Date 07/08/2017
 *  Purpose:To find the prime numbers that are Anagram and Palindrome 
 **/
import com.bridgeit.utility.Utility;

public class AngramAndPalindrome {
	public static void main(String[] args) {

		String[] array = Utility.prime(1000);

		// To print Anagram in given range of prime numbers
		System.out.println("Anagram in given range of prime numbers are:");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (Utility.anagram(array[i], array[j])) {
					System.out.println(array[i] + " " + array[j]);
				}
			}
		}

		// To print palindrome in given range of prime numbers
		System.out.println("\nPalindrome in given range of prime numbers are:");
		for (int i = 0; i < array.length; i++) {
			if (Utility.palindrome(array[i])) {
				System.out.println(array[i]);

			}
		}
	}
}
