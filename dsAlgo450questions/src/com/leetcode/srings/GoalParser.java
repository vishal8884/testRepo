package com.leetcode.srings;

public class GoalParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interpret("G()()()()(al)");

	}

	public static String interpret(String str) {

		String n = str.replace("()", "o");
		String k = n.replace("(al)", "al");

		System.out.println(k);

		return "";
	}

	public String interpret2(String command) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < command.length(); i++) {
			if (command.charAt(i) == 'G') {
				sb.append('G');
			} else if (i + 1 < command.length() && command.charAt(i + 1) == ')') {
				sb.append('o');
				i++;
			} else {
				sb.append("al");
				i = i + 3;
			}
		}
		return sb.toString();
	}

}
