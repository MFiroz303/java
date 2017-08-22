package com.bridgeit;

import com.bridgeit.utility.Utility;
public class Payment {

	public static void main(String[] args) {
    Utility utility=new Utility();
		//Take input 
		int P = Integer.parseInt(args[0]);
		int Y = Integer.parseInt(args[1]);
		int R = Integer.parseInt(args[2]);

		//call monthly payment method of utility class and print payment
		System.out.println(utility.monthlyPayment(P, Y, R));
	}

}
