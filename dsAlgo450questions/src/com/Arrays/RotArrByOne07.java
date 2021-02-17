package com.Arrays;

import java.util.Scanner;

public class RotArrByOne07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter total no of test cases");
		int tcases = sc.nextInt();
		
		for(int i=0;i<tcases;i++)
		{
//			System.out.println("Enter len of array");
			int arrlen = sc.nextInt();
			int[] arr = new int[arrlen];
			for(int j=0;j<arrlen;j++)
			{
				arr[j]=sc.nextInt();
			}
			rotByOne(arr);
		}

	}
	
	public static void rotByOne(int[] arr)
	{
		int lastElem = arr[arr.length-1];
		int[] narr=new int[arr.length];
		narr[0]=lastElem;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(i==j+1)
				{
					narr[i]=arr[j];
				}
			}
		}
		
		
		for(int i : narr)
		{
			System.out.print(i+" ");
		}
		
	}

}
