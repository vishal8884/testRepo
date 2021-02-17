package com.Arrays;

import java.util.Arrays;

public class KadanesAlgo08 {

	public static void main(String[] args) {

		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(maxkandanaeSum(arr));
		System.out.println(maxSubArraySum(arr));
		
	}
	
	public static int maxkandanaeSum(int[] arr)
	{
		int sum=0;
		int max=Integer.MIN_VALUE;

		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i+j<=arr.length-1)
				{
				 sum=sum+arr[i+j]; 
				    if(sum>max)
					   max=sum;
				}
				
			}
			sum=0;
		}
		
		
		return max;
		
	}
	
	 static int maxSubArraySum(int a[]) 
	    { 
	        int size = a.length; 
	        int max= Integer.MIN_VALUE, sum = 0; 
	  
	        for (int i = 0; i < size; i++) 
	        { 
	        	sum = sum + a[i]; 
	            if (max< sum)
	                max = sum; 
	            if (sum < 0)  // if sum is neg then sum will be zero other than that addition is array elem is done normally
	            	sum= 0; 
	        } 
	        return max; 
	    } 

}


//public static void maxkandanaeSum(int[] arr)
//{
//	int sum=0,iandj=0;
//	int max=Integer.MIN_VALUE;
//
//	
//	for(int i=0;i<arr.length;i++)
//	{
//		for(int j=0;j<arr.length;j++)
//		{
//			iandj=i+j;
//			if(iandj<=4)
//			{
//			sum=sum+arr[iandj]; 
//			  if(sum>max)
//			  {
//				  max=sum;
//			  }
//			System.out.println("i ::"+i+" j :: "+j+"   arr[i] ::"+arr[i]+"   sum :: "+sum +"   arr[i+j] :: "+arr[i+j]);
//			}
//			
//		}
//		System.out.println();
//		sum=0;
//	}
//	
//	System.out.println("final max :: "+max);
//	
//}













//for(int i=0; i< arr.length ;i++)
//{
//	sum=sum+arr[i];
//	if(arr[i]>max)
//	{
//		max=arr[i];
//	}
//}
