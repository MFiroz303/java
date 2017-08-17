package com.bridgeit;

/**
 * Date 13/08/2017
 *  Purpose:Binary Search the Word from Word List,Print the result if the word is found or not.
 **/
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class BinarySrchOfWords {
	public static void main(String[] args) {
		String string = "";
		
			File file = new File("/home/bridgeit/firoz/String.txt");
			try {
                  Utility ul=new Utility();
				// create a fileReader to read the content of the file
				FileReader fileReader = new FileReader(file);
				char ch[] = new char[(int) file.length()];
				
				fileReader.read(ch);
				System.out.println("The content of your file is:");
				System.out.println(ch);
				
				for (int i = 0; i < ch.length; i++) {
					string = string + ch[i];
				}

				// split the string and sort it
				String[] str = string.split(" ");
				str = ul.sortArrayString(str);

				System.out.println("enter your searching String from the file");
				String search = ul.inputString();

				/*
				 * To search the words in the list To check is present or not
				 */
				if (ul.binarySearchString(str, search) != 1) {
					System.out.println("sorry!!!   we did not find your element in the file");
				} else {
					System.out.println("yes , your element is present in the file");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
