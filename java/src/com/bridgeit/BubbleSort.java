package com.bridgeit;

import com.bridgeit.utility.Utility;
public class BubbleSort 
{
	public static void main(String[] args) {
		//Take input array 
		int array[] = { 3, 60, 35, 2, 45, 320, 5 };
        
		//print before sort
		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		// sorting array elements using bubble sort
		Utility.bubbleSort(array);
       
		//print after sort
		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}


