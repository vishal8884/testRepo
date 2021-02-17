package com.leetcodesolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(arr,9)));
		
	}
	
	
    public static int[] twoSum(int[] nums, int target) {
	
    	int sum=0;
    	List<Integer> l = new ArrayList<Integer>();
    	for(int i=0;i<nums.length;i++)
    	{
    		for(int j=0;j<nums.length;j++)
    		{
    			if(i!=j && nums[i]+nums[j]==target)
    			{
    				l.add(i);
    			}
    		}
    	}
    	
    	
    	return l.stream().mapToInt(i->i).toArray();
        
    }

}
