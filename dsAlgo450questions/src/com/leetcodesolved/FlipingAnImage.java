package com.leetcodesolved;

import java.util.Arrays;

public class FlipingAnImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr  = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(arr);
        int[] t = {1,0,1};
        replace0with1(t);
	}

	public static int[][] flipAndInvertImage(int[][] arr) {

		for(int[] a : arr)
		{
			rev(a);
			replace0with1(a);
			System.out.println(Arrays.toString(a));
		}
		
		System.out.println(Arrays.deepToString(arr));
		return null;
	}
	
	
	public static void rev(int[] arr)
	{
		int n=arr.length,x=0,f=0;
		int[] temp = new int[arr.length];
		for(int i=n-1;i>=0;i--)
		{
			temp[x]=arr[i];
			x++;
		}
		for(int i : temp)
		{
			arr[f]=i;
			f++;
		}
	}
	
	public static void replace0with1(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr[i]=1;
			}
			else if(arr[i]==1)
			{
				arr[i]=0;
			}
		}
	}
}












//for(int i=0;i<arr.length;i++)
//{
//	for(int j=0;j<arr[i].length;j++)
//	{
//		System.out.print(arr[i][j]+"  ");
//	}
//	System.out.println(" ");
//}