package com.leetcode.srings;

public class SameHalfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "book";
		halvesAreAlike(s);
	}

	public static boolean halvesAreAlike(String s1) {

		String s=s1.toLowerCase();
		int half=s.length()/2,c1=0,c2=0;
		String f1=s.substring(0, half);
		String f2=s.substring(half,s.length());
		
		for(char c : f1.toCharArray())
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				c1++;
			}
		}
		for(char c : f2.toCharArray())
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				c2++;
			}
		}
		
		return c1==c2;
	}

}
