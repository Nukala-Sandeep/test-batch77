package com.javaintro;

import java.util.Arrays;

public class AddListReverse {

	public static void main(String[] args) {
		int[] nums1={1,3};
		int[] nums2= {2,4};
		double median;
		double[] a=new double[nums1.length+nums2.length];
		int k=0;
		for(int i=0;i<nums1.length;i++) {
			a[k]=nums1[i];
			k++;
		}
		for(int j=0;j<nums2.length;j++) {
			a[k]=nums2[j];
			k++;
			
		}
		
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		if(k%2!=0) {
			median=a[k/2];
			System.out.println(median);
		}else {
			median=(a[(k-1)/2]+a[(k/2)])/2;
			System.out.println(median);
		}
		
	}

}
