package com.javaintro;

import java.util.Arrays;

public class IsomorphicString {
	

	public static void main(String[] args) {
		String s="egg";
		String t="add";
		char[] a=s.toCharArray();
		char[] b=t.toCharArray();
		int	n=a.length+b.length;
		char[][] c=new char[a.length][2];
		for(int i=0;i<a.length;i++) {
			c[i][0] = a[i];
		    c[i][1] = b[i];
				
			}
		for (int i = 0; i < c.length; i++) {
		    System.out.println(Arrays.toString(c[i]));
		}
		
		System.out.println(a);
		System.out.println(b);
	
}
}
