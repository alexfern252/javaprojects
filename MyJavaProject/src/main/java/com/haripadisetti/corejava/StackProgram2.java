package com.haripadisetti.corejava;

class Node{
	
	private int value;
	Node next;
	
	public Node(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}

class Stack2{
	
	Node top;
	
	public void push(int value) {
		
		if(top == null) {
			top = new Node(value);
		}
		
		Node node = new Node(value);
		top.next = node;
		top = top.next;
	}
	
	public int pop() {
		
		int value = top.getValue();
		top =top.next;
		return value;
	}
}

public class StackProgram2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack2 stack = new Stack2();
		stack.push(10);
		stack.push(20);
		
		System.out.println("latest value=" + stack.pop());
		System.out.println("latest value2=" + stack.pop());
	}

}
