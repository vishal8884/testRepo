package com.leetcodesolved;

import java.util.Arrays;

public class SquaresOfTheSortedARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-4,-1,0,3,10};
		sortedSquares(arr);
	}

	
    public static int[] sortedSquares(int[] nums) {
        
    	int[] temp = new int[nums.length];
    	
    	for(int i=0;i<nums.length;i++)
    	{
    		temp[i]=nums[i]*nums[i];
    		System.out.println(temp[i]);
    	}
    	Arrays.sort(temp);
    	return temp;
    }
}
