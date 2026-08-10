package com.javaintro;

 public class Example {
	
	{
		System.out.println("instance block called");
		
	}
	static {
		System.out.println(" static block called");
		Example ex1=new Example();
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Example ex=new Example();
		
		System.out.println("main method ended");
		

	}
	}
class Good{
	public static void main(String[] args) {
		System.out.println("good");
	}
}
