package com.javaintro;

public class Validparentheses {

	public static void main(String[] args) {
		String s="([{}])";
		char[] arr=new char[s.length()];
		
		int k=0;
		char top=arr[0];
		for(int i=0;i<s.length();i++) {
			System.out.println("k: "+k);
			
			if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'  ){
				arr[k]=s.charAt(i);
				k++;
				top=arr[k-1];
				
			}else if(s.charAt(i)==')' ){
				if(k>0 && top=='(') {
					k--;
					if(k>0) {
						top=arr[k-1];
					}
					
				} else {
					System.out.println(false);
					return ;
				}
					
			}else if(s.charAt(i)=='}' ){
				if(k>0 && top=='{') {
					k--;
					if(k>0) {
						top=arr[k-1];
					}
					
				} else {
					System.out.println(false);
					return ;
				}
			}else if(s.charAt(i)==']' ){
				if(k>0 && top=='[') {
					k--;
					if(k>0) {
						top=arr[k-1];
					}
					
				} else {
					System.out.println(false);
					return ;
				}
			}
			
			System.out.println(top);
			
		}
		if(k==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		System.out.println("k: "+k);
		System.out.println(top);
		
	}

}
