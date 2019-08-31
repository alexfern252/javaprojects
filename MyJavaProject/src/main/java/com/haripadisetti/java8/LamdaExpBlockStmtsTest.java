package com.haripadisetti.java8;

interface Add{
	
	public int addition(int a,int b);
}

class AddImpl implements Add{

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

public class LamdaExpBlockStmtsTest {

	public static void main(String[] args) {
		
		Add add1 = new AddImpl();
		int c=add1.addition(5, 3);
	    System.out.println("Total=" + c);
	    
	    Add add2 = (int a,int b) -> a+b;
	    int c2=add2.addition(8, 8);
	    System.out.println(" lamda Total=" + c2);
		
	}
}
