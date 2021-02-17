package com.leetcodesolved;

import java.util.Arrays;

public class AverageSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
		average(arr); 
	}

	public static double average(int[] arr) {

		if(arr.length<=1)
			return Double.valueOf(arr[0]);
		
		double arrlen= arr.length-2;
			
		Arrays.sort(arr);
		int sum=0;
		for(int i=1;i<arr.length-1;i++)
		{
			sum=sum+arr[i];
			System.out.println("arr :: "+arr[i]+"    sum ::"+sum);
		}
		System.out.println(sum/arrlen);
		return 0;
	}

}
