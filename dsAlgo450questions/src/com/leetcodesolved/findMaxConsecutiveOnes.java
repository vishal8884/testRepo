package com.leetcodesolved;

import java.util.Arrays;

public class findMaxConsecutiveOnes {

	public static void main(String[] args) {

		int[] arr = {12,345,2,6,7896};
		findMaxConsecutiveOnes(arr);
	}

	public static int findMaxConsecutiveOnes(int[] nums) {

		int c=0,max=0,x=0,c2=0;
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] temp= new int[nums.length];
		if(nums.length<=0)
			return 0;
		for(int i=0;i<nums.length;i++)
		{
			while (nums[i] != 0) {
			      // num = num/10
			      nums[i] /= 10;
			      c++;

			      System.out.println("no of digits in "+i+"   and c::"+c);
			}
			temp[x]=c;
			x++;
			c=0;
		}
		System.out.println(c);
		System.out.println(Arrays.toString(temp));
		for(int i : temp)
		{
			if(i%2==0)
			{
				c2++;
				System.out.println(c2);
			}
		}
		return 0;
	}
	
	public int findNumbers(int[] nums) {
	       int count = 0;
	        for (int i = 0; i < nums.length; i++) {
	            int num = nums[i];
	            String str = Integer.toString(num);
	            if (str.length() % 2 == 0)
	                count++;
	        }
	        return count;
	    }

}