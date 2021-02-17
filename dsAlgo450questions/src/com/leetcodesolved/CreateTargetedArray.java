package com.leetcodesolved;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetedArray {

	public static void main(String[] args) {

		int[] nums= {1,2,3,4,0};
		int[] index= {0,1,2,3,0};
		createTargetArray(nums,index);
	}

	public static int[] createTargetArray(int[] nums, int[] index) {

		ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(index[i],nums[i]);
        }
        System.out.println(a);
        int target[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            target[i] = a.get(i);
        }
        
        return target;
	}

}
