package com.bridgeit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.bridgeit.MyOrderedList;
public class OrderedList {

	public static void main(String[] args) {

		//creating object of MyOrderedList class
		MyOrderedList<Integer> orderedList = new MyOrderedList<Integer>();
		String[] strings;
		BufferedReader bufferedReader = null;
		try {
			FileReader fileReader = new FileReader("/home/bridgeit/firoz/Number.txt");
			bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				line = line.replaceAll("\\.", "");
				strings = line.split(" ");
				for (String integer : strings) {
					orderedList.add(Integer.parseInt(integer));
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

		orderedList.list();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to search: ");
		int search = scanner.nextInt();
		scanner.close();
		int pos;

		if ((pos = orderedList.index(search)) == -1) {
			System.out.println("This word is not in the file. Adding it to the list.");
			orderedList.add(search);
		} else {
			System.out.println("Word is at " + pos + ". Removing it from list.");
			orderedList.remove(search);
		}
		try {
			int size = orderedList.size();
			PrintWriter printWriter = new PrintWriter("/home/bridgeit/firoz/Number.txt");
			for (int i = 0; i < size; i++) {
				int integer = orderedList.pop(0);
				printWriter.write(integer + " ");
			}
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

