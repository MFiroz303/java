package com.bridgeit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonInventory {

	// Use a method to write data
	void writeData() {
		Scanner scanner = new Scanner(System.in); // Take input
		String[] inventory = { "wheat", "pulses", "rice" };

		// create JSON object
		JSONObject inventoryObject = new JSONObject();

		for (int i = 0; i < 3; i++) {
			System.out.println("How many types of " + inventory[i]);
			int types = scanner.nextInt();

			// create JSON Array
			JSONArray typeArray = new JSONArray();

			for (int j = 0; j < types; j++) {
				System.out.print("Enter name ,weight,and price: ");
				String name = scanner.next();
				double weight = scanner.nextDouble();
				double price = scanner.nextDouble();

				// create JSON object
				JSONObject jsonObject = new JSONObject();

				// put the key and value in jSON Object
				jsonObject.put("name", name);
				jsonObject.put("weight", weight);
				jsonObject.put("price", price);
				typeArray.add(jsonObject);

			}
			inventoryObject.put(inventory[i], typeArray);
		}
		try {
			PrintWriter printWriter = new PrintWriter("/home/bridgeit/firoz/inventory.txt");
			printWriter.write(inventoryObject.toJSONString());
			printWriter.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scanner.close();
	}

	public static void main(String[] args) {
		JsonInventory management = new JsonInventory();
		management.readData();
	}

	// Using readData method to read the data from the file
	void readData() {
		JSONParser parser = new JSONParser();

		JSONObject inventoryObject = null;

		/**
		 * invoking parser with parse method create reader to read the content
		 * of file
		 */
		try {
			try {
				inventoryObject = (JSONObject) parser
						.parse(new InputStreamReader(new FileInputStream("/home/bridgeit/firoz/inventory.txt")));

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// take data in string
		String[] inventory = { "wheat", "pulses", "rice" };
		for (int i = 0; i < 3; i++) {

			// create JSON Array and use get method
			JSONArray jsonArray = (JSONArray) inventoryObject.get(inventory[i]);
			double value = 0;

			Iterator iterator = jsonArray.iterator(); // Use Iterator
			while (iterator.hasNext()) {
				JSONObject jsonObject = (JSONObject) iterator.next();

				// Using get method to get value from JSON object
				System.out.println("name: " + jsonObject.get("name"));
				System.out.println("weight " + jsonObject.get("weight"));
				System.out.println("price " + jsonObject.get("price"));
				System.out.println();

				value += (double) jsonObject.get("weight") * (double) jsonObject.get("price");
			}
			System.out.println(inventory[i] + " inventory value: " + value);
		}
	}
}
