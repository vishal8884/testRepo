package com.leetcodesolved;

public class StudentHomeWork {

	public static void main(String[] args) {

		int[] a= {4};
		int[] b= {4};
		int q=4;
		busyStudent(a,b,q);
	}

	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

		int c=0;
		
		for(int i=0;i<startTime.length;i++)
		{
			if(startTime[i]<=queryTime && endTime[i]>=queryTime)
			{
				c++;
			}
		}
		System.out.println(c);
		return 0;
	}

}
