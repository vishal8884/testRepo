package com.leetcode.Math;

import java.util.Arrays;

public class ReverseInteger {

	public static void main(String[] args) {

		reverse(1534236469);
	}

	public static int reverse(int x) {

		int rev = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
				return 0;
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
				return 0;
			rev = rev * 10 + pop;
		}
		return rev;

	}

}

//public static int reverse(int x) {
//	boolean belowZero=false;
//	if(x<0)
//	{
//		x=0-x;
//		belowZero=true;
//	}
//	String s = String.valueOf(x);
//	char[] c = new char[s.length()];
//	int y=0,op=0;
//	for(int i=s.length()-1;i>=0;i--)
//	{
//		c[y] = s.charAt(i);
//		y++;
//	}
//	int number = Integer.parseInt(new String(c));
//	if(belowZero)
//	op=-number;
//	else
//	op=number;	
//	
//	System.out.println(op);
//	return op;
//}