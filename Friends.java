package com.javaintro;

public class Friends {
	static void friend1() {
		System.out.println("Friend1 called. ");
		Friends frd=new Friends();
		frd.friend2();	
	}
    void friend2() {
    	System.out.println("Friend2 called.");
    	friend3();
    }
    static void friend3() {
    	
    	System.out.println("Friend3 called.");
    	Friends frd=new Friends();
		frd.friend4();
    }
    void friend4() {
    	
    	friend7();
    	friend5();
    	System.out.println("Friend4 called.");
    }
    static void friend5() {
    	Friends frd=new Friends();
		frd.friend6();
    	System.out.println("Friend5 called.");
    }
    void friend6() {
    	friend8();
    	friend7();
    	System.out.println("Friend6 called.");
    	
    }
    static void friend7() {
    	friend9();
    	System.out.println("Friend7 called.");
    }
    void friend8() {
    	friend10();
    	System.out.println("Friend8 called.");
    }
    static void friend9() {
    	System.out.println("Friend9 called.");
    }
    void friend10() {
    	
    	System.out.println("Friend10 called.");
    }
    

	public static void main(String[] args) {
		System.out.println("main method started." );
		friend1();
		System.out.println("main method ended.");
		
	}

}
