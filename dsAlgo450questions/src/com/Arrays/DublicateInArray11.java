package com.Arrays;

public class DublicateInArray11 {

	public static void main(String[] args) {

		int[] arr = {1,3,4,2,2};
		findDublicate(arr);
	}
	
	public static void findDublicate(int[] arr)
	{
		int dub=0,dubindex=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
					if((arr[i]==arr[j]) && (i!=j))
					{
						dub=arr[i];
						dubindex=i;
					}
			}
		}
		
		System.out.println(dub);
	}

}
