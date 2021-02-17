package com.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class KthSmallestElement {

	public static void main(String[] args) {

		int arr[] = {7 ,10 ,4 ,20 ,15};
		int op=kthSmallest(arr, 4);
		System.out.println("kth min element is "+op);

	}

	public static int kthSmallest(int[] arr, int k) {

		int min = Integer.MAX_VALUE;
		int minIndex = 0, c = 0, c2 = 0;
		int[] narr = null;

		while (c2 < k) 
		{
			if (c2 != 0) 
			{
				narr = removeTheElement(narr, minIndex);
			} 
			else //if c2 is zero
			narr = arr;
			
				min = Integer.MAX_VALUE;
			for (int i = 0; i < narr.length; i++) 
			{
				if (narr[i] < min) 
				{
					min = narr[i];
					minIndex = i;
				}
			}
			c2++;
		}

		return min;
	}

//	public static void kthSmallest(int[] arr, int k) {
//
//		int min = Integer.MAX_VALUE;
//		int minIndex = 0, c = 0, c2 = 0;
//        int[] narr=null;
//		
//        while(c2<3)
//        {	
//        	if(c2!=0)
//        	{
//        	narr=removeTheElement(narr,minIndex);
//        	for(int i : narr)
//        	{
//        		System.out.println("i "+i);
//        	}
//        	if(c!=3)
//        	min=Integer.MAX_VALUE;	
//        	}
//        	else
//        	narr=arr;	
//		for (int i = 0; i < narr.length; i++)
//		{
//			if (narr[i] < min) 
//			{
//				min = narr[i];
//				minIndex = i;
//				System.out.println("Inside min " + min + "  :: Min index " + minIndex);
//			}
//			c++;
//			System.out.println("count :: "+c +"  ::: index  "+i);
//		}
//		 c2++;
//		 c=0;
//  		 System.out.println("count2  :::::::::::::::: "+c2 +"    Outsidemin :: "+min +"   minIndex "+minIndex);
//        }
//        
//        System.out.println("output min "+min);	
//	}

	public static int[] removeTheElement(int[] arr, int index) {

		if (arr == null || index < 0 || index >= arr.length) {

			return arr;
		}

		return IntStream.range(0, arr.length).filter(i -> i != index).map(i -> arr[i]).toArray();
	}

}
