package com.Arrays;

import java.util.Arrays;

public class XOROperation {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4};
		runningSum(arr);
	}

    public static int[] runningSum(int[] nums) {
        
    	int sum=0,k=0;
    	int[] arr = new int[nums.length];
    	for(int i=0;i<nums.length;i++)
    	{
    		sum=sum+nums[i];
    		arr[k]=sum;
    		k++;
    	}
    	
    	return arr;
    }
}
