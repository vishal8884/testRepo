package com.stacks;

import java.util.Stack;

public class AdjacentDublicates {

	public static void main(String[] args) {

		String s = "abbaca";
		removeDuplicates(s);
	}

	public static String removeDuplicates(String s) {

		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			st.push(s.charAt(i));
		}
            
		System.out.println(st);
		System.out.println("s ::"+s);
		return "";
	}
}
