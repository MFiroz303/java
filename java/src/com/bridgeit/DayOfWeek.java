package com.bridgeit;

import com.bridgeit.utility.Utility;

public class DayOfWeek {
	public static void main(String[] args) {
       
		//Take the input from the commnad Line
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
       
		//print the dya of week
		System.out.println(Utility.dayOfWeek(m, y, d));
	  
	} //end of main method
} //end of class
