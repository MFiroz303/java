package com.bridgeit;

import com.bridgeit.LinkedList;

public class MyQueue<T> {


	LinkedList<T> LinkedList;

	/**
	 * create Constructor initializes linked list
	 */
	public MyQueue() {
		LinkedList = new LinkedList<T>();
	}

	// add element at the end of the list

	public void enqueue(T data) {
		LinkedList.add(data);
	}

	// removes top element in the list

	public T dequeue() {
		return LinkedList.pop(0);
	}

	// true if list is empty else returns false

	public boolean isEmpty() {
		return LinkedList.isEmpty();
	}

	// return size of the list

	public int size() {
		return LinkedList.size();
	}
}
