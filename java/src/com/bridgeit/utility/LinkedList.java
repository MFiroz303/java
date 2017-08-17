package com.bridgeit.utility;

public class LinkedList<T> {

	MyNode<T> head; // first node
	MyNode<T> current; // last node
	int position; // position last node

	// create constructor
	public LinkedList() {
		head = null;
		current = null;
		position = -1;
	}

	// data added at the end of the list

	public void add(T data) {
		MyNode<T> node = new MyNode<T>(data);
		if (head == null) {
			head = node;
			current = head;
		} else {
			current.next = node;
			current = current.next;
		}
		position++;
	}

	public void remove(T data) {
		MyNode<T> tempCurrent = head;
		MyNode<T> tempPrev = null;
		while (!tempCurrent.data.equals(data)) {
			tempPrev = tempCurrent;
			tempCurrent = tempCurrent.next;
		}
		if (tempCurrent == head) {
			head = head.next;
		} else {
			tempPrev.next = tempCurrent.next;
		}
		if (tempCurrent == current) {
			current = tempPrev;
		}
		position--;
	}

	/*
	 * elements searched in the list and return true if present and false if not
	 * present
	 */

	public boolean search(T data) {
		return index(data) == -1 ? false : true;
	}

	// return true if the list is empty else returns false

	public boolean isEmpty() {
		return position == -1 ? true : false;
	}

	// returns number of elements of the list

	public int size() {
		return position + 1;
	}

	// data to be added to the end of the list

	public void append(T data) {
		add(data);
	}

	/*
	 * data element position is to be found out and returns position of the
	 * element in the list if it is in the list else returns -1
	 */
	public int index(T data) {
		if (position == -1) {
			return -1;
		}
		MyNode<T> tempCurrent = head;
		int tempPosition = 0;

		while (!tempCurrent.data.equals(data)) {
			if (tempCurrent == current) {
				return -1;
			}
			tempCurrent = tempCurrent.next;
			tempPosition++;
		}
		return tempPosition;
	}

	// inserts element 'data' at 'pos' position

	public void insert(int pos, T data) {

		if ((pos == position + 1) || (position == -1)) {
			add(data);
		} else if (pos == 0) {
			MyNode<T> tempNode = head;
			head = new MyNode<T>(data);
			head.next = tempNode;
		} else {
			MyNode<T> tempCurrent = head;
			MyNode<T> tempPrev = null;
			int tempPosition = 0;
			while (tempPosition <= pos + 1) {
				tempPrev = tempCurrent;
				tempCurrent = tempCurrent.next;
				tempPosition++;
			}
			MyNode<T> newNode = new MyNode<T>(data);
			newNode.next = tempCurrent;
			tempPrev.next = newNode;
		}
		position++;
	}

	// poped the element at given location

	public T pop(int location) {
		MyNode<T> tempCurrent = head;
		MyNode<T> tempPrev = null;
		int tempPosition = 0;
		position--;
		while (tempPosition != location) {
			tempPrev = tempCurrent;
			tempCurrent = tempCurrent.next;
			tempPosition++;
		}
		if (tempCurrent == head) {
			head = head.next;
			return tempCurrent.data;
		} else if (tempCurrent == current) {
			current = tempPrev;
			tempPrev.next = tempCurrent.next;
			return tempCurrent.data;
		} else {
			tempPrev.next = tempCurrent.next;
			return tempCurrent.data;
		}
	}

	// pops and returns last element in the list

	public T pop() {
		return pop(position);
	}

	// prints elements in the list

	public void list() {
		MyNode<T> tempCurrent = head;
		while (tempCurrent != null) {
			System.out.println(tempCurrent.data);
			tempCurrent = tempCurrent.next;
		}
	}
}

class MyNode<T> {
	T data; // stored data
	MyNode<T> next; // reference of next node

	MyNode(T data) {
		this.data = data;
		next = null;
	}

} // end of class

