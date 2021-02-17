package com.Arrays;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		removearr(arr,2);
		
	}
	
	public static void removearr(int[] arr ,int index)
	{
		int[] narr = new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i!=index)
			{
			narr[j]=arr[i];
			j++;
			}
		}
		
		System.out.println(Arrays.toString(narr));
	}

}
