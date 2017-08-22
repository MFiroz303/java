package com.bridgeit;

/**
 * Date 07/08/2017 Purpose: to find the roots of the equation a*x*x + b*x + c.
 **/
import com.bridgeit.utility.Utility;
public class QuadratiEq {
	static double delta, root1, root2;
	public static void main(String[] args) {
		int choice = 0;
		do {
        Utility ul = new Utility();
			ul.findRoot(delta, root1, root2);
			
			// Logic for continue the programme
			System.out.println("press 1 for continue");
			choice = ul.inputInteger();
		} while (choice == 1);
	}
}