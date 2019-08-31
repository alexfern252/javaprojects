package com.haripadisetti.corejava;


class Stack {

	int[] stackArray;
	int top;

	Stack(int size) {
		stackArray = new int[size];
	}

	public void push(int value) {
		stackArray[top++] = value;
	}

	public int pop() {
		int value = stackArray[--top];
		return value;
	}
}

public class StackProgram {

	public static void main(String[] args) {

		Stack stackObj = new Stack(6);
		stackObj.push(10);
		System.out.println(stackObj.stackArray[0]);

		stackObj.push(20);
		System.out.println(stackObj.stackArray[1]);
		stackObj.push(30);
		System.out.println(stackObj.stackArray[2]);
		// stackObj.push(40);
		// stackObj.push(50);

		System.out.println("Last in  value=" + stackObj.pop());
	}
}
