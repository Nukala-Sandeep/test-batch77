package com.javaintro;

class A{
	B b;
}
class B { 
	A a;
}

public class GarbageCollector {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finilize called.");
	}
	void hello()
	{
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		GarbageCollector garcol=new GarbageCollector();
		System.out.println(garcol);
		GarbageCollector garcol1=new GarbageCollector();
		System.out.println(garcol1);
		garcol=null;
		GarbageCollector gbc=new GarbageCollector();
		garcol1=gbc;
		System.gc();
		System.out.println(garcol1);
		System.out.println(gbc);
		garcol1.hello();
		
		A obj1= new A();
		B obj2=new B();
		obj1.b=obj2;
		obj2.a=obj1;
		obj1.b=null;
		obj2.a=null;
		obj2.a=obj1;
		System.gc();
		System.out.println(obj2.a);
		
		
		System.out.println("main method ended");
	}

}

