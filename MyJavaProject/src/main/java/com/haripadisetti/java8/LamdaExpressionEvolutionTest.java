package com.haripadisetti.java8;


//Greeter class for invoking different actions/behaviors
class Greeter{
	
	private Greetings greetings;

	public Greeter(Greetings greetings) {
		super();
		this.greetings = greetings;
	}
	
	public void execute() {
		
		greetings.perform();
	}
	
}


//Greetings interface
interface Greetings{
	
	public void perform();
}


//HelloworldGreetings Impls
class HelloworldGreetings implements Greetings{

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Interface - Implementation-1: Helloworld");
	}
}

//GoodDay Implementation class
class GoodDay implements Greetings{

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Interface - Implementation-2:GoodDay");
	}
}

public class LamdaExpressionEvolutionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greetings greetings = new HelloworldGreetings();
		Greeter greeter = new Greeter(greetings);
		greeter.execute();
		
		//Created lamda expression
		Greetings greetings2 = () -> System.out.println("LAMDA IMPL-1");
		Greeter greeter2 = new Greeter(greetings2);
		greeter2.execute();
		
		Greetings greetings3 = () -> System.out.println("LAMDA IMPL-2");
		Greeter greeter3 = new Greeter(greetings3);
		greeter3.execute();

		Greetings greeting4 = new GoodDay();
		Greeter greeter4 = new Greeter(greeting4);
		greeter4.execute();
		
	}

}
