package com.bridgeit;

import java.util.Scanner;
public class CashCounter {

	//using scanner to take input
	static Scanner scanner = new Scanner(System.in);
	int balance = 0;   //initaialize balance
	//creating object of queue
	MyQueue<Integer> people = new MyQueue<Integer>();
	
	//main method
	public static void main(String[] args) {
		int choice = 0;
		//create object of class
		CashCounter counter = new CashCounter();
		
		do {
			//Take input as choice
			System.out.println("1: Deposit");
			System.out.println("2: Withdraw");
			System.out.println("3: People next to you");
			System.out.println("4: Quit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			counter.action(choice);
			
		}while(choice != 4);
		
		//to check condition that expression is balanced or not
		if(counter.balance == 0) {
			System.out.println("Expression is balanced");
		}
		else {
			System.out.println("Expression is not balanced");
		}
	}

	//create action method 
	void action(int choice) {
		int money;
		/*Using Switch case
		 * taking input using scanner
		 * print size of queue.
		 *  */
		switch(choice) {
		case 1:
			System.out.print("Enter amount to deposit: ");
			money = scanner.nextInt();
			people.enqueue(money);
			balance += money;
			System.out.println();
			break;
		case 2:
			System.out.print("Enter amount to withdraw: ");
			money = scanner.nextInt() * -1;
			people.enqueue(money);
			balance += money;
			System.out.println();
			break;
		case 3:
			System.out.println("\n" + (people.size() - 1) + " people ahead of you\n");
			break;
		default:			
		}
	}
}
