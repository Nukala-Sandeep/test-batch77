package com.javafumdamentals;

public class Keywords {
	static int count=0;
	static int count1=0;
	static{
		count1++;
	}
	{
		count++;
	}
	public static void main(String[] args) {
		
		Keywords k1=new Keywords();
		Keywords k2=new Keywords();
		Keywords k3=new Keywords();
		Keywords k4=new Keywords();
		System.out.println(count);
		System.out.println(count1);
	}

}
