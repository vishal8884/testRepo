package com.leetcodesolved;

import java.util.Arrays;

public class Palidrome {

	public static void main(String[] args) {

		boolean a=isPalidrome(-121);
		System.out.println(a);
	}

	public static boolean isPalidrome(int x)
	{
		Integer y =x;
		String str=y.toString();
		
		char[] c = str.toCharArray();
		char[] revc = reverseArray(c);
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(revc));
		
		
		return Arrays.equals(c, revc);
		
	}
	
	
	public static char[] reverseArray(char[] arr)
	{
		char[] narr= new char[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			narr[j]=arr[i];
			j++;
		}
		return narr;
	}
}
