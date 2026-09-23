package com.javaintro;

public class Handling {

	public static void main(String[] args) {
//		try {
//		int num1,num2,result;
//		num1=5;
//		num2=0;
//		result=num1/num2;
//		System.out.println(result);
//	}
//		catch(ArithmeticException e) {
//			System.out.println("You cannot divide a number by zero");
//		}
		
		
		try {
		int[] Number= {1,2,3,4,5};
		System.out.print(Number[5]);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Something went wrong .check the index again.");
		}
		}

}
