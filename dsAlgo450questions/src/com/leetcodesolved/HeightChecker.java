package com.leetcodesolved;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {

		int[] arr = {1,1,4,2,1,3};
		heightChecker(arr);
	}
	
	public static int heightChecker(int[] heights) {

		int[] sorted = heights.clone();
        Arrays.sort(sorted);
        
        int nb = 0;
        for(int i=0;i<heights.length;i++){
            if(sorted[i] != heights[i]){
                nb++;
            }
        }
        return nb;
		
	}

}
