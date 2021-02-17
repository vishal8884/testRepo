package com.leetcodesolved;

import java.util.Arrays;

public class MaxSubArray {

	public static void main(String[] args) {

		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		maxsubarr(arr);
		
		
	}
	
	public static void maxsubarr(int[] arr)
	{
		int sum=0,max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(sum>max)
               max=sum;
			if(sum<0)
               sum=0;
		}
		
		
		System.out.println(max);
	}
    public static int maxSubArray(int[] arr) {
    	
    	int sum=0,max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(sum>max)
               max=sum;
			if(sum<0)
               sum=0;
		}
		
		return max;
        
    }

}
