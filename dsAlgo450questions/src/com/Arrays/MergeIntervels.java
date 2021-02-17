package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervels {

	public static void main(String[] args) {

		// int[][] arr = {{1,4},{5,6}};
		int[][] arr = { {1,3} , {2,6} , {8,10} ,{15,18}};
		System.out.println(Arrays.deepToString(merge(arr)));

	}

	public static int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		List<int[]> merged = new ArrayList<>();
		
		for(int[] interval : intervals)
		{
			if(merged.isEmpty() || interval[0] > merged.get(merged.size()-1)[1])
			{
				System.out.println(Arrays.toString(interval));
				merged.add(interval);
			}
			else
			{
				merged.get(merged.size()-1)[1]=Math.max(merged.get(merged.size()-1)[1],interval[1]);
			}
		}
		
		
		return merged.toArray(new int[merged.size()][]);
		//int[] intArray = new int[20];
		 
	}
	
	
	 public static int[][] mergeUsingLinekedList(int[][] intervals) {
			Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
			LinkedList<int[]> merged = new LinkedList<>();
			
			for(int[] interval : intervals)
			{
				if(merged.isEmpty() || interval[0] > merged.getLast()[1])
				{
					System.out.println(Arrays.toString(interval));
					merged.add(interval);
				}
				else
				{
				    merged.getLast()[1]=Math.max(merged.getLast()[1],interval[1]);
				}
			}
			
			
			return merged.toArray(new int[merged.size()][]);
		}

}

//public static void merge(int[][] arr)
//{
//	int k=0,notei=-2,k2=0,c=0,in=0;
//	int[] narr = new int[arr.length*2];
//	
//	for(int a[] : arr)
//	{
//		for(int i=0;i<a.length;i++)
//		{
//			narr[k]=a[i];
//			k++;
//		}
//	}                                 // converts into single array
//	
//	System.out.println("single arr :: "+Arrays.toString(narr));
//	
//	for(int i=0;i<narr.length-1;i++)
//	{
//		if(narr[i]>narr[i+1])
//		{
//			notei=i;
//			c++;
//		}
//	}
//	int[] temp = new int[narr.length-(c+1)];
//	for(int i=0;i<narr.length-1;i++)
//	{
//		if(i!=notei && i!=notei+1)
//			{
//				System.out.println("narr ::"+narr[i]);
//				temp[k2]=narr[i];
//				k2++;
//			}
//	}
//	temp[temp.length-1]=narr[narr.length-1];
//	System.out.println("removed unwanted  :: "+Arrays.toString(temp));
//	
//	int[][] op = new int[3][2];
//	
//	for(int i=0;i<op.length;i++)
//	{
//		for(int j=0;j<op[i].length;j++)
//		{
//			op[i][j] = temp[in];
//			in++;
//		}
//	}
//	
//	System.out.println(Arrays.deepToString(op));
//	
//}