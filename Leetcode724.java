package com.javaintro;

public class Leetcode724 {
//1,7,3,6,5,6
	public static void main(String[] args) {
		int[] nums = { -1,-1,0,1,1,0 };
		int pivot = 0;
		int sum = 0;
		int add = 0;
		for (int i = 0; i < nums.length ; i++) {
			pivot = i;
			if (i==nums.length-1) {
				if (sum == add) {
					System.out.println(pivot);
					}
				
			}else {
			for (int j = i + 1; j < nums.length; j++) {

				add = add + nums[j];
				System.out.println(sum + "," + add);

			}
			if (sum == add) {
				System.out.println(pivot);
				break;

			}}

			add = 0;
			sum = sum + nums[i];

		}
		System.out.println(-1);

	}
}
