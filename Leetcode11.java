package com.javaintro;

public class Leetcode11 {

	public static void main(String[] args) {
		
		int[] height= {1,2};
		if(height.length<2){
            System.out.println(0);
        }
		int water=0;
        int maxWater=0;
        int left=0;
        int right=height.length-1;
        for(int i=0;i<height.length;i++){
            if(left<right){
            if(height[left]<height[right]){
                water=height[left]*(right-left);
                left++;
                System.out.println("left: "+water);
            }else if(height[left]>height[right]){
                water=height[right]*(right-left);
                right--;
                System.out.println("right: "+water);
            }
            else if(height[left]==height[right]){
                water=height[right]*(right-left);
                right--;
            }
            if (water>maxWater){
                maxWater=water;
                System.out.println("Max Water: "+maxWater);
            }

        }
        }
        System.out.println(maxWater);

	}

}
