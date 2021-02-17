package com.leetcode.srings;

public class CheckEquivalentString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] w1 = {"ab", "c"};
		
		String[] w2 = {"a", "bc"};
		
		arrayStringsAreEqual(w1,w2);
	}

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

		String t1="";
		String t2="";
		
		for(String w : word1)
		{
			t1=t1+w;
		}
		
		for(String w : word2)
		{
			t2=t2+w;
		}
		System.out.println(t1.equals(t2));
		return t1==t2;
	}

}
