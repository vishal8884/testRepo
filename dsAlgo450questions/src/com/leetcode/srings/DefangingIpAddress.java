package com.leetcode.srings;

import java.util.ArrayList;
import java.util.List;

public class DefangingIpAddress {

	public static void main(String[] args) {

		defangIPaddr3("1.1.1.1");
	}


	public static String defangIPaddr(String address) {

		return address.replace(".", "[.]");

	}

	public static String defangIPaddr3(String address) {
//		StringBuilder str = new StringBuilder();
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) == '.') {
				str.append("[.]");
			} else {
				str.append(address.charAt(i));
			}
		}
		
		var a=0;
		System.out.println(str);
		return str.toString();
	}

}

//for(int i=0;i<address.length();i++)
//{
//	
//	if(address.charAt(i)=='.')
//	{
//		addr
//	}
//}