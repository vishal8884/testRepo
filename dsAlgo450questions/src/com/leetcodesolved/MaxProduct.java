package com.leetcodesolved;

import java.util.Arrays;

public class MaxProduct {

	public static void main(String[] args) {

		int[] arr= {3,4,5,2};
		maxProduct(arr);
	}

	public static int maxProduct(int[] arr) {

		Arrays.sort(arr);
		int len = arr.length;
		System.out.println(Arrays.toString(arr));
		
		int a = arr[len-1]-1;
		int b = arr[len-2]-1;
		
		System.out.println(a*b);
		return a*b;
	}
}
