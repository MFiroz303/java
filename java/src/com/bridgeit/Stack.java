package com.bridgeit;

public class Stack {
	private int maxSize;
	private long stackArray[];
	private int top;

	// Constructor
	public Stack(int s) {
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}

	// for push 
	public void push(long j) {
		stackArray[++top] = j;
	}

	// for pop 
	public long pop() {
		return stackArray[top--];
	}

	// for peek 
	public long peek() {
		return stackArray[top];
	}

	// create a method to check empty or full
	public boolean isEmpty(){
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

} //end of class 


