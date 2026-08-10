package com.javaintro;

public class Leetcode7 {

	public static void main(String[] args) {
		int x=2147483419;
		int temp=Math.abs(x);
        int rev=0;
        int n;
        
        while(temp>0){
            n=temp%10;
            
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE /10 && n>7)) {
            	System.out.println("rev is not in integer range.");
            }else
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE /10 && n<-8)) {
            	System.out.println("rev is not in integer range.");
            }
            rev=rev*10+n;
            temp=temp/10;

            
        }  
        
        if(x<0) {
        	System.out.println(-rev);
        }else {
        	System.out.println(rev);
        	}
        	
	}

}
