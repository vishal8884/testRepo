package com.Arrays;

public class minimumJumps10 {

	public static void main(String[] args) {

		int[] arr = {1 ,4 ,3 ,2 ,6 ,7};
		minJumps(arr);
	}
	public static void minJumps(int[] arr){
		
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			
			i=i+arr[i];
			System.out.println(i +" ::i");
			c++;
		}
		
		System.out.println(c +" ::count");
	}

}
