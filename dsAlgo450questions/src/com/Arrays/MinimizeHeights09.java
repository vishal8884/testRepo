package com.Arrays;

public class MinimizeHeights09 {

	public static void main(String[] args) {

		int[] arr = {2 ,6 ,3 ,4 ,7 ,2 ,10 ,3 ,2 ,1};
		int k=5;
		minimizeHeight(arr,k);
	}
	
	
	public static void minimizeHeight(int[] arr , int k)
	{
		int j=0,max=0,min=Integer.MAX_VALUE;
		int[] narr= new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]-k)>0)
			{
			narr[i] = arr[i]-k;
			}
			else
			narr[i] = arr[i]+k;	
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(narr[i]>max)
				max=narr[i];
			if(narr[i]<min)
				min=narr[i];
			
//			System.out.println(narr[i]);
		}
		
		System.out.println(max-min);
	}

}
