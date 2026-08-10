package com.javaintro;

import java.util.Scanner;

public class PrimePattern {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter n: ");
//		int n=sc.nextInt();
		int n=5;
		int num=1;
		
		
		for(int i=0;i<n;i++) {
			int j=0;
			while ( j<=i) {
				int count=0;
				if(num==1) {
					System.out.print(1);
					j++;
				}
				else {
					for(int k=1;k<=num;k++) {
						int s;
						
						s=num%k;
//						System.out.println("s="+s+","+num+","+k);
						if(num%k==0) {
							count++;
//							System.out.println("s="+s+","+num+","+k+","+count);
					}
						
				}
					
				
				}
				if(count>2) {
					System.out.print(num+" ");
					j++;
				}
				num++;
				
				
				}
			System.out.println();
		}
		

	}

}
