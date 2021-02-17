package com.leetcodesolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeRequiredElement {

	public static void main(String[] args) {

		int[] arr= {3,2,2,3,8};
		System.out.println(removeElement(arr,2));
	}

	
	public static int removeElement(int[] arr, int val)
	{
		int len = arr.length,k=0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=val)
			{
				list.add(arr[i]);
			}
		}
		int[] temp = new int[list.size()];
		for(int e : list)
		{
			temp[k++]=e;
		}
	
		Arrays.fill(arr, 0);
		for(int i=0;i<temp.length;i++)
		{
			arr[i]=temp[i];
		}
		
		System.out.println(Arrays.toString(arr));
		return list.size();
		
	}
	
	public int removeElement2leetcodesol(int[] nums, int val) {
	    int i = 0;
	    for (int j = 0; j < nums.length; j++) {
	        if (nums[j] != val) {
	            nums[i] = nums[j];
	            i++;
	        }
	    }
	    return i;
	}
	
	
//	public static int[] removeIndex(int[] arr,int val)
//	{
//		int len= arr.length , j=0;
//		int[] temp= new int[len-1];
//		for(int i=0;i<len;i++)
//		{
//			if(arr[i]!=val)
//			{
//				temp[j++]=arr[i];
//			}
//		}
//		
//		System.out.println(Arrays.toString(temp)+"  :: temp");
//		
//		return temp;
//	}

}







//public static void removeElement(int[] arr, int val)
//{
//	int len = arr.length , k=0;
//	int[] temp= new int[len-2];
//	List<Integer> list = new ArrayList<Integer>();
//	for(int i=0;i<arr.length;i++)
//	{
//		if(arr[i]==val)
//		{
//			list.add(i);
//		}
//	}
//
//	for(int e : list)
//	{
//		temp[k++]=removeIndex(arr,e);
//	}
//	
//	System.out.println("list ::"+list);
//}
