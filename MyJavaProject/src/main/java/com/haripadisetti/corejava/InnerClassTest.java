package com.haripadisetti.corejava;


import com.haripadisetti.corejava.Outer.Inner;

// member inner class example - Start
class Outer{
	
	private String data = "OuterData";
	
	class Inner{
		
		void printMsg() {
			System.out.println("Accessing Outer class Data is =" + data);
		}
	}
}

//member inner class example - End

//Anonymous inner class example - Start
abstract class Person{
	
	abstract void eat();
}

interface Person2{
	
	public void walk();
}
//Anonymous inner class example - End

//local inner class example - Start
class LocalInnerExample{
	
	int data = 100;
	
	void display() {
		
		class Local{
			
			void message(){
				System.out.println(" Local inner class example - data=" + data);
			}
		}
		
		Local local = new Local();
		local.message();
	}
	
}
//local inner class example - End
public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Member inner class
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.printMsg();

		//Anonymous inner class  - Abstract class
		Person person = new Person() {
			
			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println(" eat");
			}
		};
		
		person.eat();
		
		//Anonymous inner class  - Interface
		Person2 person2 = new Person2() {
			
			public void walk() {
				// TODO Auto-generated method stub
				System.out.println("Walking");
			}
		};
		
		person2.walk();
		
		//Local inner class
		LocalInnerExample locaInnerExample = new LocalInnerExample();
		locaInnerExample.display();
		
	}

	
	
}
