package com.bridgeit;

/**
 * Date 07/08/2017
 *  Purpose: To return all permutation of a String
 **/
import com.bridgeit.utility.Utility;
public class Permutation {
	public static void main(String[] args) {
		int choice=0;
		
	do{	
		Utility ul = new Utility();
		System.out.println("Enter a String : ");
		String string = ul.inputString();

		int lengthOfString = string.length();
		Utility.permute(string, 0, lengthOfString - 1);
		
		// Logic for continue the programme
		Utility ul1 = new Utility();
		System.out.println("press 1 for continue");
		choice = ul1.inputInteger();
	 } while (choice == 1);
	}
}