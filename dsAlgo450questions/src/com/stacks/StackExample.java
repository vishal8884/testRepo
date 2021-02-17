package com.stacks;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();
		
		s.push("d");
		s.push("fs");
		s.push("ds");
		
		String sd = s.pop();
		
		System.out.println(s);
		
		System.out.println(sd);
	}

}
