package com.bridgeit;

import com.bridgeit.utility.Utility;
public class SquareRoot {
	public static void main(String[] args) {
		Utility u = new Utility();
		double c = Double.parseDouble(args[0]);
		double epsilon = 1e-15;
		double t = c;

		// repeatedly apply
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;

			System.out.println(t);
		}
	}

}
