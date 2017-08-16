package com.bridgeit;

public class SquareRoot {
	public static void main(String[] args) {
		
		double c = Double.parseDouble(args[0]);
		double epsilon = 1e-15;
		double t = c;

		//method repeatedly apply to get the exact root
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;

			System.out.println(t);
		}
	}

}
