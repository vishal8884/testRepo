package com.leetcodesolved;

import java.util.Arrays;

public class ArrayPartition {

	public static void main(String[] args) {

		int[] arr = {6,2,6,5,1,2};
		arrayPairSum(arr);
	}

	public static int arrayPairSum(int[] nums) {

		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
            System.out.println("sum inside :: "+sum);
        }
        return sum;
	}

}
