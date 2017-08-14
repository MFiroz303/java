package com.bridgeit;

import com.bridgeit.utility.Utility;
public class InsertionSort
{

	public static void main(String[] args) {
		
		//Take input string array in  unsorting order
		String[] array = { "JavaScript", "Java", "C#", "C++", "Python", "Sql", "Ruby", "Php" };

		System.out.println("Unsorted array:");

		//Enhanced for  lop
		for (String element : array)

			System.out.print(element + " ");
		System.out.println();

		//sort the srtring array
		Utility.insertionSort(array);
		System.out.println();

		System.out.println("Sorted array:");

		//Use Enhanced for loop and print sorted string array  
		for (String element : array)
			System.out.print(element + " ");
	}
}


