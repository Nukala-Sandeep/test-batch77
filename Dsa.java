package com.javaintro;
import java.util.Arrays;
import java .util.Scanner;
public class Dsa {
	public static boolean isPrime(int a){
		boolean status=true;
		if(a==0||a==1) {
			return false;
		}else {
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}else {
				status=true;
			}
			
		}
		
		
		
	}return status;
		}
	public static char[] sortString(String a) {
		char[] x=new char[a.length()];
		for(int i=0;i<a.length();i++) {
			x[i]=(a.charAt(i));
		}
		for(int j=0;j<x.length-1;j++) {
			for(int k=j+1;k<x.length;k++)
			if(x[j]>x[k]) {
				char temp=x[j];
				x[j]=x[k];
				x[k]=temp;
				
				
			}
		}
		return  x;
		
	}

	public static void main(String[] args) {
///		 find targetsum
//		int[] arr= {2,3,5,6,8,9,11,12};
//		int target=25;
//		int left=0;
//		int right=arr.length-1;
//		boolean flag=false;
//		while(left<right) {
//			int sum=arr[left]+arr[right];
//			if(sum==target) {
//				System.out.println(arr[left]+" + "+arr[right]+"->"+sum);
//				flag=true;
//				left++;
//				right--;
//				
//			}
//			else if(sum<target) {
//				left++;
//			}else {
//				right--;
//			}
//		}
//		if(!flag) {
//			System.out.println("target not found!!");
//		}
//**********************************************************************************************************		
///		finding Min,Max
//		int[] nums= {10,4,3,15,1,2};
//		int min=nums[0];
//		int max=nums[0];
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i]<min) {
//				min=nums[i];
//			}else if(nums[i]>max){
//				max=nums[i];
//			}
//		}
//		System.out.println("Min element is: "+min);
//		System.out.println("Max element is: "+max);
//**********************************************************************************************************
///		Enter numbers and print only prime numbers 
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter array size: ");
//		int size=sc.nextInt();
//		int[] array=new int[size];
//		System.out.println("enter elements in array: ");
//		for(int i=0;i<size;i++) {
//			array[i]=sc.nextInt();
//		}
//		for(int a:array) {
//			if(isPrime(a)) {
//			System.out.print(a+" ");
//		}}
//*********************************************************************************************************
/// 	2D Array printing
		
		
		/**simple for loop**/
//	int[][] arr2d=new int[3][3];
//		arr2d[0][0]= 11;
//		arr2d[1][1]=22;
//		arr2d[2][2]=33;
//		for(int i=0;i<arr2d.length;i++) {
//			for(int j=0;j<arr2d[i].length;j++) {
//				System.out.print((arr2d[i][j])+" ");
//			}
//			System.out.println();
//		}
//*************************************		
		/**for each loop**/
//		int arr2d[][]= {{1,2,3},
//				{4,5,6},
//				{7,8,9}};
//		int row=0;
//		for(int i[]:arr2d) {
//			int col=0;
//			for(int j:i) {
//				if(row==col) {
//				System.out.print(j+"  ");
//				}
//				col++;
//			}
//			row++;
//			System.out.println();
//		}
//****************************************		
		/**while loop**/
//		int arr2d[][]= {{1,2,3},
//						{4,5,6},
//						{7,8,9}};
//		int i=0;
//		while(i<arr2d.length) {
//			int j=0;
//			while(j<arr2d[i].length) {
//				System.out.print (arr2d[i][j]+" ");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
//********************************************************************************************************
///			  Strings
		
//		String[] str= {"madhav","raghu","sriman narayana","joe","sandeep"};
//		String longname=str[0];
//		String shortname=str[0];
		
		/**** min name ,max name  ****/
//		for(int i=0;i<str.length;i++) {
//			if(str[i].length()<shortname.length()) {
//				shortname=str[i];
//			}else if(str[i].length()>longname.length()) {
//				longname=str[i];
//			}
//		}
//		System.out.println("Longest Name: "+longname);
//		System.out.println("Sortest Name: "+shortname);
		
		/**** sorting ****/
//		for(int i=0;i<str.length;i++) {
//			for(int j=i;j<str.length;j++) {
//				if(str[j].length()<str[i].length()) {
//					String temp=str[i];
//					str[i]=str[j];
//					str[j]=temp;
//				}
//			}
//			System.out.println(str[i]+","+str[i].length());
//		}
//		System.out.println(Arrays.toString(str));
		
		/**** read charactors ****/
		
		String a="dare";
		String b="read";
		char[] result1=sortString(a);
		char[] result2=sortString(b);
		System.out.println(new String(result1)+","+new String(result2));
		
		if(new String(result1).equals(new String(result2))) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}
