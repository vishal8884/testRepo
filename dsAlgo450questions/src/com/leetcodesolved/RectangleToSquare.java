package com.leetcodesolved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.Set;

public class RectangleToSquare {

	public static void main(String[] args) {

		int[][] arr = {{2,3},{3,7},{4,3},{3,7}};
		countGoodRectangles2(arr);
	}

	public static int countGoodRectangles(int[][] arr) {
	
		int c=0;
		List<Integer> list = new ArrayList<Integer>();
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			min=Integer.MAX_VALUE;
			c=0;
			for(int j=0;j<arr[i].length;j++)
			{
				c++;
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
				if(c==2) {
				list.add(min);}
			}
		}
		System.out.println(list);
		
		int max=list.stream().mapToInt(i -> i).max().orElse(0);
		int m1 = max;
		long count = list.stream().filter(i -> i==max).count();
		System.out.println(max);
		int c2 = (int) count;
		return c2;
	}
	
	
	
	 public static int countGoodRectangles2(int[][] rectangles) {
		 
	        int cnt = 0, mx = 0;
	        for (int[] rec : rectangles) 
	        {
	            int side = Math.min(rec[0], rec[1]);
	            System.out.println("side :: "+side);
	            if (side > mx) 
	            {
	                cnt = 1;
	                mx = side;
	            }
	            else if (side == mx)
	            {
	                ++cnt;
	            }
	        }
	        System.out.println(cnt);
	        return cnt;
	    }
	
	}































//public static int countGoodRectangles(int[][] arr) {
//
//	int c=0;
//	List<Integer> list = new ArrayList<Integer>();
//	int min=Integer.MAX_VALUE;
//	
//	for(int i=0;i<arr.length;i++)
//	{
//		min=Integer.MAX_VALUE;
//		c=0;
//		for(int j=0;j<arr[i].length;j++)
//		{
////			System.out.println(arr[i][j] +"       i :: "+i+"   j :: "+j);
//			c++;
//			if(arr[i][j]<min)
//			{
//				min=arr[i][j];
//			}
//			if(c==2) {
//			System.out.println(min+" min     c::"+c);
//			list.add(min);}
//		}
//		System.out.println(" ");
//	}
//	System.out.println(list);
//	int c2=0;
//	int maxl=Integer.MIN_VALUE;
//	for(int l : list)
//	{
//		if(l>maxl)
//			maxl=l;
//	}
//	for(int l : list)
//	{
//		if(l==maxl)
//			c2++;
//	}
//	
//	
//	System.out.println(maxl);
//	System.out.println(c2);
//	
//	return 0;
//}
//
//}
