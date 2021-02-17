package com.Arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ThreeSum {

	public static void main(String[] args) {

		int[] arr = {-1,0,1,2,-1,-4};
		threeSum(arr);
	}
	
	public static List<List<Integer>> threeSum(int[] num) {
	    
		Arrays.sort(num);
		
		List<List<Integer>> l = new LinkedList<>(); 
		
		for(int i=0;i<num.length-2;i++)
		{
			if(i==0 || (i>0 && num[i]!=num[i-1]))  //to avoid dublicates
			{
				int sum=-num[i];
				int low = i+1;
				int high= num.length-1;
				
				while(low<high)
				{
					if(num[low]+num[high]==sum)
					{
						l.add(Arrays.asList(num[i], num[low], num[high]));
						System.out.println(l);
						while (low < high && num[low] == num[low+1]) low++;
	                    while (low < high && num[high] == num[high-1]) high--;
						low++;
						high--;
					}
					else if (num[low] + num[high] < sum) low++;
	                else high--;
				}
			}
		}
		
		return null;
	}

}
