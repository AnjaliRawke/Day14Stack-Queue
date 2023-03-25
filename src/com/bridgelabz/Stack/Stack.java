package com.bridgelabz.Stack;


	public class Stack<T extends Comparable<T>> {
		LinkedList<T> linkedList = new LinkedList<>();

		public void push(T data) {
			linkedList.push(data);
		}

		public void show() {
			linkedList.show();
		}

}
