package com.Arrays;

import java.util.Arrays;

public class SortedArrayof0sand1s {

	public static void main(String[] args) {

		int[] arr= {0,1,0};
		sort012(arr);
	}
	
	
	public static void sort012(int arr[]){
		
		int zero=0,one=0,two=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			  zero++;
			if(arr[i]==1)
			  one++;
			if(arr[i]==2)
              two++;
		}
		
		for(int i=0;i<zero;i++)
		    arr[i]=0;
		for(int i=zero;i<zero+one;i++)
			arr[i]=1;
		for(int i=zero+one;i<zero+one+two;i++)
			arr[i]=2;
		
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
	}

}
