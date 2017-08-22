package com.bridgeit;

import com.bridgeit.LinkedList;

public class MyStack<T> {
	

	LinkedList<T> LinkedList;
		
		public MyStack(){
			LinkedList = new LinkedList<T>();
		}
		
		public void push(T data){
			LinkedList.add(data);
		}
		
		public T pop(){
			return LinkedList.pop();
		}
		
		public T peek(){
			T temp = LinkedList.pop();
			LinkedList.add(temp);
			return temp;
		}
		
		public boolean isEmpty(){
			return LinkedList.isEmpty();
		}
		
		public int size(){
			return LinkedList.size();
		}
}

