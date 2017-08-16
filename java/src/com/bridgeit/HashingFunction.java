package com.bridgeit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import com.bridgeit.utility.Utility;

import com.bridgeit.MyOrderedList;

public class HashingFunction {

	BufferedReader bufferedReader = null;
	HashMap<Integer, MyOrderedList<Integer>> myHashMap;

	public static void main(String[] args) {

		HashingFunction function = new HashingFunction();

		function.initialization();
		function.readFile();
		function.searchNumber();

	}

	// Initialize hashmap and puts order list
	void initialization() {
		myHashMap = new HashMap<Integer, MyOrderedList<Integer>>();
		for (int i = 0; i < 11; i++) {
			myHashMap.put(i, new MyOrderedList<Integer>());
		}
	}

	// read file and add numbers to respective order List
	void readFile() {
		bufferedReader = null;

		try {

			FileReader fileReader = new FileReader("/home/bridgeit/firoz/writer.txt");
			bufferedReader = new BufferedReader(fileReader);

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] strings = line.split(" ");
				for (String integer : strings) {
					int numberToAdd = Integer.parseInt(integer);
					MyOrderedList<Integer> list = myHashMap.get(numberToAdd % 11);
					list.add(numberToAdd);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			bufferedReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// search for a number
	void searchNumber() {
		Utility utility = new Utility();
		System.out.println("Enter a number to search");
		int search = utility.inputInteger();
		MyOrderedList<Integer> list = myHashMap.get(search % 11);

		if (list.search(search)) {

			System.out.println("File contains number to Remove it");
			list.remove(search);
		} else {
			System.out.println("File does not contains the number to add the list");
			list.add(search);
		}

		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter("/home/bridgeit/firoz/writer.txt");

			for (int i = 0; i < 11; i++) {
				list = myHashMap.get(i);
				while (!list.isEmpty()) {
					printWriter.write(list.pop(0) + " ");
				}
			}

			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
