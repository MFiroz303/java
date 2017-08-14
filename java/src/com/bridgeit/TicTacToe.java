package com.bridgeit;

import java.util.Random;
import com.bridgeit.utility.Utility;
import com.bridgeit.TicTacToeMe;

public class TicTacToe {
	public static void main(String[] args) {
		int check = 0;
		System.out.println("You need to put two index in order to mark the cell ");
		Random random = new Random();
		Utility ul = new Utility();
		TicTacToeMe tictactoeMe = new TicTacToeMe();

		int[][] a = new int[3][3];
		while (tictactoeMe.empty(a)) {
			int i = random.nextInt(3);
			int j = random.nextInt(3);

			if (a[i][j] == 0)
				a[i][j] = 1;
			else
				continue;

			tictactoeMe.display(a);

			if (!(tictactoeMe.result(a, 1, i, j))) {
				System.out.println("computer won");
				check++;
				break;
			}
			System.out.println("enter your index");

			int m = ul.inputInteger();
			int n = ul.inputInteger();
			if (a[m][n] == 0)
				a[m][n] = 2;
			else {
				System.out.println("space has occupied\n try with another index");
				continue;
			}
			tictactoeMe.display(a);
			if (!tictactoeMe.result(a, 2, m, n)) {
				System.out.println("congratulation you won");
				check++;
				break;
			}
		}

		if (check == 0)
			System.out.println("ops!! game draw !! no one is winner");
	}
}
