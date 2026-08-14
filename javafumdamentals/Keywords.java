package com.javafumdamentals;

public class Keywords {
	void primitiveDT(){
		byte a=127;
		short b=32767;
		int c=2147483647;
		long d=922300000000000000L;
		float e=1234.123f;
		double f=1221.12d;
		char g='g';
		boolean h=true;
		
		System.out.println("***********Premitive Data Types**********");	
		System.out.println("Byte a: "+a);
		System.out.println("Short b: "+b);
		System.out.println("Int c: "+c);
		System.out.println("Long d: "+d);
		System.out.println("Float e: "+e);
		System.out.println("Double f: "+f);
		System.out.println("Char g: "+g);
		System.out.println("boolean h:"+h);
	}
	
	/** static **/
//	static int count=0;
//	static int count1=0;
//	static{
//		count1++;
//	}
//	{
//		count++;
//	}
//	void Objcount() {
//		Keywords k1=new Keywords();
//		Keywords k2=new Keywords();
//		Keywords k3=new Keywords();
//		Keywords k4=new Keywords();
//		System.out.println(count);
//		System.out.println(count1);
//	}
	public static void main(String[] args) {
		Keywords k=new Keywords();
//		k.Objcount();
		k.primitiveDT();
	}

}
