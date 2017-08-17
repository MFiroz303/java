package com.bridgeit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.bridgeit.utility.LinkedList;

public class UnOrderedList {
	
	public static void main(String[] args) {

		//creating LinkedList
		LinkedList<String> myLinkedList = new LinkedList<String>();
		String[] strings;
		BufferedReader bufferedReader = null;
        
		try {
			
			/* Creating a file to read the content */
			FileReader fileReader = new FileReader("/home/bridgeit/firoz/T.txt");
			bufferedReader = new BufferedReader(fileReader);
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				line = line.replaceAll("\\.", "");
				strings = line.split(" ");
				
                /* Using enhanced for loop and add the string to the list */
				for (String s : strings) {
					myLinkedList.add(s);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {

			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		/*To Check words in file 
		 * if present then remove
		 * if not present add 
		 */
		myLinkedList.list();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word to search: ");
		String search = scanner.nextLine();
		scanner.close();
		int pos;

		if ((pos = myLinkedList.index(search)) == -1) {
			System.out.println("This word is not in the file. Adding it to the list.");

			myLinkedList.add(search);
		} else {
			System.out.println("Word is at " + pos + ". Removing it from list.");

			myLinkedList.remove(search);
		}
		try {
			int size = myLinkedList.size();
			PrintWriter printWriter = new PrintWriter("/home/bridgeit/firoz/T.txt");

			for (int i = 0; i < size; i++) {
				String st = myLinkedList.pop(0);
				printWriter.write(st + " ");
			}
			printWriter.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	} // end of main

} // end of class

