package com.haripadisetti.corejava;


class Data {

	private final int value = 10;

	Data() {
	}

	int getValue() {
		return value;
	}
}

public class AccessModifierTest {

	public static void main(String[] args) {
		System.out.println(" Test ");
		Data data = new Data();
		System.out.println("Data value=" + data.getValue());
	}
}
