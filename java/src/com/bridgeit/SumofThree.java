package com.bridgeit;

/*
* Date 07/08/2017
* Purpose:Reads in N integers and counts the number of triples that sum to exactly 0.  ­
*/

import com.bridgeit.utility.Utility;
public class SumofThree {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int array[] = utility.readArray();
		utility.display(array);

		System.out.println();

		int count = utility.sumofthree(array);
		System.out.println("No.of Tripltes : " + count);

	}
}