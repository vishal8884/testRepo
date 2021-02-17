package com.leetcode.srings;

public class NumberOfConsistentStrings {

	public static void main(String[] args) {

		String allowed = "ab";
		String[] words = { "ad", "bd", "aaab", "baa", "badab" };
		countConsistentStrings(allowed, words);
	}

	public static int countConsistentStrings(String allowed, String[] words) {
		int f = 0;
		int c = 0;
		for (String s : words) {
			char[] ar1 = s.toCharArray();
			for (int i = 0; i < ar1.length; i++) {
				if (allowed.contains(ar1[i] + "")) {
					f = 1;
				} else {
					f = 0;
					break;
				}
			}
			if (f == 1) {
				c++;
			}
		}
		System.out.println(c);
		return c;
	}

//	public static int countConsistentStrings(String allowed, String[] words) {
//
//		
//		StringBuilder s = new StringBuilder();
//		s.
//		int c=0;
//		for(int i=0;i<words.length;i++)
//		{
//			for(int j=0;j<allowed.length();j++)
//			{
//				System.out.println("word :: "+words[i]+"   allowed :: "+allowed.charAt(j));
//				if(words[i].contains("a") && words[i].contains("b"))
//				{
//					System.out.println(words[i]);
//				}
//
//			}
//			System.out.println(" ");
//		}
//		
//		System.out.println(c);
//		return c;
//	}

}
