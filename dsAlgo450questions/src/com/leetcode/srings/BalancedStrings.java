package com.leetcode.srings;

public class BalancedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		balancedStringSplit("RLRRLLRLRL");
	}

	public static int balancedStringSplit(String s) {

		int r=0;
		int l=0,c=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='R')
			{
				r++;
//				System.out.println("r :: "+r+"  i :: "+i);
			}
			if(s.charAt(i)=='L')
			{
				l++;
				System.out.println("l :: "+l+"  i :: "+i);
			}
			
			if(r==l) {
				c++;
				System.out.println("c :: "+c);
			}
			
		}
		
		
		return c;
	}
}
