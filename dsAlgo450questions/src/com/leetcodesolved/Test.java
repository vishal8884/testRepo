package com.leetcodesolved;

public class Test {

	public static void main(String[] args) {

		System.out.println(FindSum(23,4));
	}
	
	
	
	public static int FindSum(int n,int k)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{

            if(i%k!=0)
			sum=sum+i;
		}
		
		//System.out.println("sum ::"+sum);
		return sum;
	}

}
