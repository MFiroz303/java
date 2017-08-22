package com.bridgeit;

import com.bridgeit.LinkedList;

public class Deque<T>{
	
	  // create object of linkedlist
		LinkedList<T> myLinkedList;
		
		public Deque(){
			myLinkedList = new LinkedList<T>();
		}
		
		//create a method to add the front position
		public void addFront(T data){
			myLinkedList.insert(0 ,data);
		}
		
		//create a method to add to the rear  position
		public void addRear(T data){
			myLinkedList.add(data);
		}
		
		// create a method to remove front element
		public T removeFront(){
			return myLinkedList.pop(0);
		}
		
		// create a method to remove front element
		public T removeRear(){
			return myLinkedList.pop();
		}
		
		//To cheack list is empty or not
		public boolean isEmpty(){
			return myLinkedList.isEmpty();
		}
		
		//create a method size to return the size of list
		public int size(){
			return myLinkedList.size();
		}
	
}