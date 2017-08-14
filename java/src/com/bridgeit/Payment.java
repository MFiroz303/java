package com.bridgeit;

import com.bridgeit.utility.Utility;

public class Payment {

	public static void main(String[] args) {

		int P = Integer.parseInt(args[0]);
		int Y = Integer.parseInt(args[1]);
		int R = Integer.parseInt(args[2]);

		System.out.println(Utility.monthlyPayment(P, Y, R));
	}

}
