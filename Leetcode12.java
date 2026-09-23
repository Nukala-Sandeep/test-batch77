package com.javaintro;

public class Leetcode12 {

	public static void main(String[] args) {
		int num = 344;
		if (num>3999) {
			System.out.println("number should be in between 1-3999: ");
		}else {

		while (num > 0) {

		    if (num >= 1000) {
		        System.out.print("M");
		        num -= 1000;
		    }

		    else if (num >= 900) {
		        System.out.print("CM");
		        num -= 900;
		    }

		    else if (num >= 500) {
		        System.out.print("D");
		        num -= 500;
		    }

		    else if (num >= 400) {
		        System.out.print("CD");
		        num -= 400;
		    }

		    else if (num >= 100) {
		        System.out.print("C");
		        num -= 100;
		    }

		    else if (num >= 90) {
		        System.out.print("XC");
		        num -= 90;
		    }

		    else if (num >= 50) {
		        System.out.print("L");
		        num -= 50;
		    }

		    else if (num >= 40) {
		        System.out.print("XL");
		        num -= 40;
		    }

		    else if (num >= 10) {
		        System.out.print("X");
		        num -= 10;
		    }

		    else if (num >= 9) {
		        System.out.print("IX");
		        num -= 9;
		    }

		    else if (num >= 5) {
		        System.out.print("V");
		        num -= 5;
		    }

		    else if (num >= 4) {
		        System.out.print("IV");
		        num -= 4;
		    }

		    else {
		        System.out.print("I");
		        num -= 1;
		    }
		}
		}
	}

}
