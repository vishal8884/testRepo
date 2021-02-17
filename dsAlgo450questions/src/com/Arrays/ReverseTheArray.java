package com.Arrays;

public class ReverseTheArray {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5};
		int[] rev=reverseArray(arr);
		
		for(int i : rev)
		{
			System.out.println(i);
		}
	}

	
	public static int[] reverseArray(int[] arr)
	{
		int[] narr= new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			narr[j]=arr[i];
			j++;
		}
		return narr;
	}
}
