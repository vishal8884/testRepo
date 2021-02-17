package com.leetcodesolved;

import java.util.Arrays;

public class DublicateZeroShiftRight {

	public static void main(String[] args) {

		int[] arr = {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
	}

	
    public static void duplicateZeros(int[] arr) {
        
    	
    	for(int i=6;i>=0;i--)
    	{
    		arr[i+1]=arr[i];
    	}
    	arr[0]=89;
    	System.out.println(Arrays.toString(arr));
    }
}
