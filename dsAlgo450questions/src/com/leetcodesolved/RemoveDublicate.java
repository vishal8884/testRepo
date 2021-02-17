package com.leetcodesolved;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDublicate {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 1 };
		removeDuplicates4(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
	
	public static int removeDuplicates4(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
	

	public static int removeDuplicates(int[] nums) {

		Set<Integer> set = new HashSet<>();
		for (int t : nums) {
			set.add(t);
		}

		int n = set.size();
		int arr[] = new int[n];

		int i = 0;
		for (int x : set) {
			arr[i] = x;
			i++;
		}
		 
	    for(int f=0;f<arr.length;f++)
	    {
	    	nums[f]=arr[f];
	    	System.out.println(nums[f]);
	    }
		    

		return arr.length;

	}

	public static int removeDuplicateElements3(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        
        return j;  
    }  
	

}
