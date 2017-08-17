package com.bridgeit;

import java.util.Scanner;

public class StockReport {
	 public void stockReport(){
		  System.out.println("Stock name: ");
		  System.out.println("Share name: ");
		  System.out.println("Number of Shares: ");
		  System.out.println("Share price: ");
	 }  
		  public static void main(String[] args){
			  Scanner scanner=new Scanner(System.in);
			  
			  System.out.println("Enter Stock name");
			  String name=scanner.nextLine();
			  
			  System.out.println("Enter share name");
			  String shareName=scanner.nextLine();
			  
			  System.out.println("Enter number of shares");
			  int NofShares=scanner.nextInt();
			  
			  System.out.println("Share price");
			  int price=scanner.nextInt();
			  
	  }
}