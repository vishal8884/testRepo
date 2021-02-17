package com.Arrays;

import java.util.Arrays;

public class SortArrayss {

	public static void main(String[] args) {

		int[] arr= {4,1,2,5,3,3};
		selectionSort(arr);
	}
	
	
	public static void sortDecending(int[] arr)
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
//	4,1,2,5,3,3
	public static void sortAssending(int[] arr)
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] a) {
	    boolean sorted = false;
	    int temp;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] > a[i+1]) {
	                temp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(a));
	}
	
//	4,1,2,5,3,3
	public static void selectionSort(int[] arr) {
		
		int min=0,minId=0;
	    for (int i = 0; i < arr.length; i++) 
	    {
	    	
	        min= arr[i];
	        minId = i;
	        
	         for(int j=i+1;j<arr.length;j++)
	         {
	        	 if(arr[j]<min)
	        	 {
	        		 min=arr[j];
	        		 minId=j;
	        	 }
	         }
	         
	         int temp = arr[i];
	         arr[i]=min;
	         arr[minId]=temp;
	    }
	    
	    System.out.println(Arrays.toString(arr));
	    Arrays.sort(arr);
	}

}







//
//int min = array[i];
//int minId = i;
//for (int j = i+1; j < array.length; j++)
//{
//    if (array[j] < min) 
//    {
//        min = array[j];
//        minId = j;
//    }
//}
//// swapping
//int temp = array[i];
//array[i] = min;
//array[minId] = temp;