package com.bridgeit;

import com.bridgeit.utility.Utility;

public class SquareRoot {

	public static void main(String[] args) {
		double number = Double.parseDouble(args[0]);
		System.out.println(new Utility().sqrt(number, number));
	}
}
