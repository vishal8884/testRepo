package com.leetcodesolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -1, 0, 1, 2, -1, -4 };
		threeSum(arr);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		 if (nums.length < 3) {
		        return Collections.emptyList();
		    }
		    
		    Set<List<Integer>> set = new HashSet<>();
		    
		    Arrays.sort(nums);
		    
		    for (int i = 0; i < nums.length; i++) {
		        int target = -nums[i];
		        System.out.println("target :: "+target);
		        int j = i + 1;
		        int k = nums.length - 1;
		        
		        while (j < k) {
		            if (nums[j] + nums[k] == target) {
		                set.add(Arrays.asList(nums[i], nums[j], nums[k]));
		                j++;
		                k--;
		            } else if (nums[j] + nums[k] > target) {
		                k--;
		            } else {
		                j++;
		            }
		        }
		    }
		    System.out.println(set);
		    return new ArrayList(set);

	}

}

//List<List<Integer>> listoflist = new ArrayList<List<Integer>>();
//List<Integer> list = new ArrayList<Integer>();
//Set<Integer> set = new HashSet<Integer>();
//int sum=0;
//for(int i=0;i<nums.length;i++)
//{
//    for(int j=0;j<nums.length;j++)
//    {
//    	sum=nums[0]+nums[i]+nums[j];
//    	if(sum==0)
//    	{
//    	
//    	 list.add(nums[0]);
//    	 list.add(nums[i]);
//    	 list.add(nums[j]);
//    	}
//    	
//    	
//    }
//    listoflist.add(list);
//    System.out.println(list);
//    list.removeAll(list);
//    
//    sum=0;
//}
//
//System.out.println(list+"  :: list final");
////System.out.println(listoflist+"   lofl");
//return null;