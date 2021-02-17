package com.leetcodesolved;

import java.util.Arrays;

public class ShufleArray {

	public static void main(String[] args) {

		int[] arr= {2,5,1,3,4,7};
		shuffle(arr,3);
	}

	public static int[] shuffle(int[] nums, int n) {

		int[] op= new int[nums.length];
		int x=0,y=1;
		for(int i=0;i<n;i++)
		{
			System.out.println(nums[i]+"  i::"+i);
			op[x]=nums[i];
			x=x+2;
		}
		System.out.println("////////////////////");
		for(int i=n;i<nums.length;i++)
		{
			System.out.println(nums[i]+"  i::"+i);
			op[y]=nums[i];
			y=y+2;
		}
		System.out.println(Arrays.toString(op));
		
		return null;
	}

}
