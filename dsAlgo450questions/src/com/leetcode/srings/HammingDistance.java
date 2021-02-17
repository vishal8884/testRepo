package com.leetcode.srings;

public class HammingDistance {

	public static void main(String[] args) {

		hammingDistance(5,3);
	}
	
	
     public static int hammingDistance(int x, int y) {
        
    	 System.out.println(Integer.bitCount(x ^ y));
    	 return -1;
    }

}
