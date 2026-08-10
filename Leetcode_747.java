package com.javaintro;

//import java.util.Arrays;

public class Leetcode_747 {

	public static void main(String[] args) {
		int[] nums= {3,2,100,45,32,1,6,101,500};
		if(nums.length<2){
            System.out.println("length is less than two");
        }
//        int[] arr=Arrays.copyOf(nums,nums.length);
//        Arrays.sort(arr);
//        int max=arr[nums.length-1];
//        int sec=arr[nums.length-2];
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==max){
//                if(sec*2<=max){
//                    System.out.println(i);
//              
//                }
//            }
//            
//            
//        }
//        System.out.println(Arrays.toString(arr));
		int max=0;
		int sec=0;
		int s=0;
		for(int i=0;i<nums.length;i++){
            if(max<=nums[i]){
            	max=nums[i];
             }
        
        }
        for(int j=0;j<nums.length;j++){
        	if(sec<=nums[j] && nums[j]!=max) {
            	sec=nums[j];
        	}
        	
            
        	if(nums[j]==max){
            	s=j;}
            if(j==nums.length-1) {
            if(sec*2<=max){
            		System.out.println(s);
            	}
            else{
            		System.out.println("Max element is smaller than double of other element in array ");
            	}
            }
            		
            	}
            }
            
        
    }


