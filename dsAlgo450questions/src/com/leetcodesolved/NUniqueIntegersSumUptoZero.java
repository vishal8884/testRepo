package com.leetcodesolved;

import java.util.Arrays;

public class NUniqueIntegersSumUptoZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumZero(7);
	}

	public static int[] sumZero(int n) {

		 int[] arr= new int[n];
		 int left=0;
		 int right=n-1;
		 int start=1;
		 
		 while(left<right)
		 {
			 arr[left++]=start;
			 arr[right--]=-start;
			 start++;
			 System.out.println(start);
		 }
		 
		 System.out.println(Arrays.toString(arr));
		
		return null;
	}

}
//if(i+j+k==0)
//{
//	System.out.println("i "+i+"    j::"+j+"   k::"+k);
//}