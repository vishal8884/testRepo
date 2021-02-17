package com.leetcodesolved;

public class HighestAltitude {

	public static void main(String[] args) {

		int[] arr= {-5,1,5,0,-7};
		largestAltitude(arr);
	}

	public static int largestAltitude(int[] arr) {

		int sum=0,max=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(sum>max)
				max=sum;
			System.out.println(sum);
		}
		System.out.println(max+" ::max");
		return 0;
	}

}
