package com.bridgeit;

import com.bridgeit.utility.Utility;

public class TempConversion {
	public static void main(String[] args) {
		Utility utility = new Utility();

		System.out.println("Enter unit of temperature");

		String unit = utility.inputString(); // take input
		System.out.println("Enter temperature");

		int temperature = utility.inputInteger(); // take input
		System.out.println(utility.temperaturConversion(temperature, unit));

	}

}
