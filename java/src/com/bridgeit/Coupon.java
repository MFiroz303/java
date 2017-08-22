package com.bridgeit;

import com.bridgeit.utility.Utility;

/**
 * Date 07/08/2017 Purpose: Given N distinct Coupon Numbers, how many random
 * numbers do you need to generate that distinct coupon number?
 **/
public class Coupon {
	static int Choice = 0;

	public static void main(String[] args) {
		Utility utility = new Utility();
		do {
			// take input String
			String string = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

			// convert string into character array
			char[] ch = string.toCharArray();
			int max = 100000000;

			// Using while loop and Math.random() to get different random value
			int random = (int) (Math.random() * max);
			StringBuffer sb = new StringBuffer();

			while (random > 0) {
				sb.append(ch[random % ch.length]);
				random = random / ch.length;
			}
			String couponCode = sb.toString();
			System.out.println("Coupon Code: " + couponCode);

			// Logic for continue the programme
			System.out.println("press 1 for continue");
			Choice = utility.inputInteger();
		} while (Choice == 1);
	}
} // end of class