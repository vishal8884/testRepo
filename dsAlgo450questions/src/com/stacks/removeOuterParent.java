package com.stacks;

import java.util.Stack;

public class removeOuterParent {

	public static void main(String[] args) {

		removeOuterParentheses("(()())(())");
	}

	public static String removeOuterParentheses(String s) {

		
		Stack<Character> st = new Stack<Character>();
		System.out.println(s);
		
		for(int i=1;i<s.length();i++)
		{
			char x = s.charAt(i);
			st.push(x);
		}
		
		System.out.println(st+" :: st");
		return null;
	}
}