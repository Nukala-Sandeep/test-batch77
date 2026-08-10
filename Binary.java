package com.javaintro;

public class Binary {

	public static void main(String[] args) {
		String a="101";
		String b="0";
//		 if(a.length()==1 && b.length()==1 && a.charAt(0)-'0'==0 && b.charAt(0)-'0'==0) {
//			 System.out.println("0");
//			 
//		 }
//		int val_a=0;
//		int val_b=0;
//		int sum=0;
//		int result;
//		for(int i=0;i<a.length();i++) {
//			val_a=val_a*2+(a.charAt(i)-'0');
//			
//			System.out.println(val_a);
//		}
//		for(int j=0;j<b.length();j++) {
//			val_b=val_b*2+(b.charAt(j)-'0');
//			System.out.println(val_b);
//		}
//		System.out.println(val_a+","+val_b);
//		sum=val_a+val_b;
//		System.out.println(sum);
//		StringBuilder n=new StringBuilder();
//		while(sum!=0) {
//		result=sum%2;
//		n.append(result);
//		sum=sum/2;
//		
//		
//	}
//		System.out.print(n.reverse().toString());

		 if(a.length()==1 && b.length()==1 && a.charAt(0)-'0'==0 && b.charAt(0)-'0'==0) {
			 System.out.println("0");
		 }
		int carry=0;
		int n;
		String result;
		StringBuilder sum=new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;

		while(i >= 0 && j >= 0) {
			if(carry==0) {
			if((a.charAt(i)-'0')==1 && (b.charAt(j)-'0')==1) {
				result="0";
				sum.append(result);
				carry=1;
				System.out.println(result);
			}else if((a.charAt(i)-'0')==0 && (b.charAt(j)-'0')==0){
				result="0";
				sum.append(result);
				carry=0;
				System.out.println(result);
			}else {
				result="1";
				sum.append(result);
				carry=0;
				System.out.println(result);
			}
			
		}
			if(carry==1) {
				if((a.charAt(i)-'0')==1 && (b.charAt(j)-'0')==1) {
					result="1";
					sum.append(result);
					carry=1;
					System.out.println(result);
				}else if((a.charAt(i)-'0')==0 && (b.charAt(j)-'0')==0){
					result="1";
					sum.append(result);
					carry=0;
					System.out.println(result);
				}else {
					result="0";
					sum.append(result);
					carry=1;
					System.out.println(result);
				}
				
			}
			i--;
			j--;
			
			
			}
		while(i>=0 || j>=0) {
			if(a.charAt(i)-'0'==0 && carry==1){
				result="1";
				sum.append(result);
				carry=0;
				
			}
			else if(a.charAt(i)-'0'==1  && carry==1){
				result="0";
				sum.append(result);
				carry=1;
				}
			if( b.charAt(j)-'0'==0  && carry==1){
				result="1";
				sum.append(result);
				carry=0;
				
			}
			else if( b.charAt(j)-'0'==1 && carry==1){
				result="0";
				sum.append(result);
				carry=1;
				}
			else {
				result="0";
				sum.append(result);
				
			}
			i--;
			j--;
		}
		if(carry==1) {
			sum.append(1);
			}
		System.out.println(sum.reverse());
}
}