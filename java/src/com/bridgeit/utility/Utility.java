package com.bridgeit.utility;

/*
* Date: 11/06/2016
* Purpose: Putting Commonly used function in single file.
	1 function to take word,integer and double as input
	2: function to read and write file.
**/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	Scanner scanner = new Scanner(System.in);
	BufferedReader br;

	/**
	 * constructor to initialize bufferedReader
	 */

	public Utility() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * take input word
	 */

	public String inputString() {
		try {
			return br.readLine();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return "";
	}

	/**
	 * Take Integer Input
	 *
	 */
	public int inputInteger() {
		try {
			try {
				return Integer.parseInt(br.readLine());
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return 0;
	}

	/**
	 * Take Double Input
	 */
	public double inputDouble() {
		try {
			try {
				return Double.parseDouble(br.readLine());
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return 0.0;
	}

	/**
	 * we create a method and check leap year or not
	 */

	public static boolean leapYear(int year) {

		if (year > 1000) {
			if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * create a method power of any number
	 * 
	 */

	public int poworOfTwo(int integer) {
		int power = 1;
		while (integer != 0) {
			power = 2 * power;
			integer--;
		}
		return power;
	}

	/*
	 * create a method for HarmMonic Number
	 */

	public double harmonicNumber(int number) {
		double sum = 0.0;
		for (int i = 1; i <= number; i++) {
			sum = sum + (1.0 / i);
		}
		return sum;
	}

	/*
	 * create a method for prime number and check
	 */

	public boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	/*
	 * create a method for sum of three integer numbers to check is zero
	 */
	public int sumofthree(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				for (int k = j; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
						count++;
					}
				}
			}
		}
		return count;
	}

	/*
	 * * create a method to read an Array
	 */
	public int[] readArray() {
		System.out.print("Enter the size of array");
		int n = scanner.nextInt();

		int a[] = new int[n];
		System.out.print("Enter the " + n + " elements ");

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	/*
	 * create a method to display an Array
	 */

	public void display(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	/*
	 * create a permute method
	 */
	public static void permute(String st, int a, int end) {
		if (a == end) {
			System.out.println(st);
		} else {
			for (int i = a; i <= end; i++) {
				st = swap(st, a, i);
				permute(st, a + 1, end);
				st = swap(st, a, i);
			}
		}
	}

	/*
	 * create a method to swap the string
	 */
	public static String swap(String st, int a, int b) {
		char[] ch = st.toCharArray();
		char temp = ch[a];
		ch[a] = ch[b];
		ch[b] = temp;
		return String.valueOf(ch);
	}

	/*
	 * Simulate Stop watch Program
	 * 
	 */
	long startTime = 0;
	long stopTime = 0;
	boolean running = false;

	public void start() {
		this.startTime = System.currentTimeMillis();
		this.running = true;
	}

	public void stop() {
		this.stopTime = System.currentTimeMillis();
		this.running = false;
	}

	public long getElapsedTime() {
		long elapsed;
		if (running) {
			elapsed = (System.currentTimeMillis() - startTime);
		} else {
			elapsed = (stopTime - startTime);
		}
		return elapsed;
	}

	/*
	 * create a power functuion
	 */

	public int powerFunction(int a, int n) {
		if (n == 0) {
			return 1;
		}
		return (a * powerFunction(a, n - 1));
	}
	/*
	 * create a method to find root
	 */

	public void findRoot() {
		double delta, root1, root2;
		System.out.println("Enter a, b, c of the Quadratic equation ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		System.out.println("Given Quadratic equation:"+a+"x^2 + "+b+"x + "+c);
		delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println(delta);
		root1 = (-1 * b + Math.sqrt(delta)) / (2 * a);

		root2 = (-1 * b - Math.sqrt(delta)) / (2 * a);

		System.out.println("Frist Root of the question is : " + root1);
		System.out.println("Second Root of the question is : " + root2);
	}

	/*
	 * create a method of calculateWindChill
	 */

	public void calculateWindChill() {
		double windChill;
		int t, v;

		System.out.println("Enter the  temperature : ");
		t = scanner.nextInt();

		System.out.println("Enter the speed of the air : ");
		v = scanner.nextInt();

		if (t > 50) {
			System.out.println("Temperature should not be greater than 50 ");
			// calculateWindChill();
			// return;
		}
		if ((v > 120) || (v < 3)) {
			System.out.println("Velocity should be greater than 3 and less than 120 ");
			calculateWindChill();
			return;
		}
		windChill = 35.74 + 0.6215 * t + (0.4275 * t - 53.75) * (Math.pow(v, 0.16));
		System.out.println("WindChill : " + windChill);
	}
	
	// create a method to check anagram
		public void isAnagram(String s1, String s2) {
			
			// replace the blank spaces
			String a = s1.replaceAll("\\s", "");
			String b = s2.replaceAll("\\s", "");

			boolean status;
			// compare length of strings
			if (a.length() != b.length()) {
				status = false;
			}

			else {
				status = true;
			}
			// using method convert the array in lower case and store as character
			char[] s1Array = a.toLowerCase().toCharArray();
			char[] s2Array = b.toLowerCase().toCharArray();

			// sort the array
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);

			// using equal() method to compare the two array
			status = Arrays.equals(s1Array, s2Array);

			if (status) {
				System.out.println(s1 + " and " + s2 + " are anagram");
			}

			else {
				System.out.println(s1 + " and " + s2 + " are not angram");
			}
		}

	/*
	 * create a method to check and print Anagram
	 */

	public static boolean anagram(String s1, String s2) {
		// to comparing and sort strings
		if (s1.length() != s2.length()) {
			return false;
		}

		char[] a = s1.toCharArray();
		Arrays.sort(a);

		char[] b = s2.toCharArray();
		Arrays.sort(b);

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	/*
	 * create a method to check and print prime Number
	 */

	public static String[] prime(int r) {
		String[] array = new String[1000];
		int position = 0;

		for (int i = 2; i <= r; i++) {
			boolean b = true;
			for (int j = 2; j <= i / 2; j++) {
				if ((i % j) == 0) {
					b = false;
					break;
				}
			}
			if (b) {
				// use valueOf() method to return string of int argument
				array[position] = String.valueOf(i);
				position++;
			}
		}
		// create new string array and pass the position value
		String[] array1 = new String[position];
		for (int k = 0; k < position; k++) {
			array1[k] = array[k];
		}
		return array1;
	}

	/*
	 * create a method to check and print Palindrome number
	 */
	public static boolean palindrome(String s) {
		if (s.length() < 2) {
			return false;
		}
		char[] c = s.toCharArray();
		int n = c.length;
		for (int i = 0; i < n; i++) {
			if (c[i] != c[n - 1 - i]) {
				return false;
			}
		}
		return true;
	}

	/*
	 * create a method tro find your number
	 */
	
	public void findNumber(int low, int high) {
		if (low == high) {
			System.out.println("Your number is : " + low);
			System.out.println("Intermediary numbers is " + (low - 1) + " and " + (low + 1));
			return;
		}

		int mid = (low + high) / 2;
		System.out.println("Press 1 : " + low + " - " + mid);
		System.out.println("Press 2 : " + (mid + 1) + " - " + high);

		int ch = new Utility().inputInteger();
		if (ch == 1) {
			findNumber(low, mid);
		} else {
			findNumber(mid + 1, high);
		}
	}

	
	/*
	 * Binary Search for String
	 */

	public int binarySearchString(String[] names, String key) {
		int first = 0;
		int last = names.length - 1;
		while (first < last) {
			int mid = (first + last) / 2;
			if (key.compareTo(names[mid]) < 0) {
				last = mid;
			} else if (key.compareTo(names[mid]) > 0) {
				first = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	

	/**
	 * create a method to sort a string array
	 * 
	 */
	public String[] sortArrayString(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings.length - 1; j++) {
				if (strings[j].compareTo(strings[j + 1]) > 0) {
					String temp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = temp;
				}
			}
		}
		return strings;
	}

	/**
	 * Insertion Sort for string
	 */

	public static void insertionSort(Comparable[] array) {
		Comparable temp;
		for (int i = 1; i < array.length; i++) // ar[i] is element to insert
		{
			temp = array[i];
			int j = 0;
			for (j = i; j > 0; j--)
				if (temp.compareTo(array[j - 1]) < 0)
					array[j] = array[j - 1];
				else
					break;
			array[j] = temp;
		}
	}

	/*
	 * create a method bubblesort to sort the array element
	 */
  public static void bubbleSort(int[] array) {
		int length = array.length;
		int temp = 0;

		for (int i = 0; i < length; i++) {
			for (int j = 1; j < (length - i); j++) {
				if (array[j - 1] > array[j])

					// Swap the value
					temp = array[j - 1];
				array[j - 1] = array[j];
				array[j] = temp;
			}
		}
	}

	/*
	 * create a method bubble sort to sort the array element
	 */

	static int i = 0; // indexing array
	static int total = 0; // total notes
	int[] notes;
	static int money;

	// create a method to calculate notes
	public int calculate(int money, int[] notes) {
		int rem;
		int total = 0;
		if (money == 0) 
			return -1;
	 else{
			if (money >= notes[i]) {
				int calNotes = money / notes[i];
				rem = money % notes[i];
				money = rem;
				total = total + calNotes;
				System.out.println(notes[i] + " Notes ---> " + calNotes);
			}
		}
			i++;
			return calculate(money, notes);
	
	}

	/*
	 * create static function to print DayOfwee
	 */

	public static int dayOfWeek(int m, int y, int d) {
		int y0 = (y - (14 - m) / 12);
		int x = (int) (y0 + y0 / 4 - y0 / 100 + y0 / 400);
		int m0 = (m + 12 * ((14 - m) / 12) - 2);
		double d0 = (d + x + 31 * m0 / 12) % 7;
		return (int) d0;
	}

	/*
	 * create a method to converte temperature and print
	 */

	public static double temperaturConversion(int temperature, String unit) {
		if (unit.equals("f")) {
			return (double) temperature * 9 / 5 + 32;
		} else {
			return ((double) temperature - 32) * 5 / 9;
		}
	}

	/*
	 * create a method to find Monthly Payment
	 */

	public static double monthlyPayment(int P, int Y, int R) {
		int n = 12 * Y;
		int r = R / (12 * 100);

		return (P * r) / (1 - Math.pow((1 + r), (-1 * n)));
	}

}
