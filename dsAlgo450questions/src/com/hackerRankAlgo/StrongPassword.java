package com.hackerRankAlgo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

	public static void main(String[] args) {

		System.out.println(minimumNumber(3,"#HackerRank"));
	}
	
	
	static int minimumNumber(int n, String pass) {

		
		char[] carr= pass.toCharArray();
    
		
		boolean lowerCase=false,upperCase=false,digit=false,special=false,leng=false;
		int lc=0,uc=0,dc=0,sc=0,c=0,note=0;
		if(pass.length()>=6)
		{
			leng=true;
		}
		if(pass.length()<6)
			note=6-pass.length();
			
		for(int i=0;i<pass.length();i++)
		{
			if(carr[i]>='a'&& carr[i]<='z')
			{
				lowerCase=true;
				lc++;
			}
			if(carr[i]>='A'&& carr[i]<='Z')
			{
				upperCase=true;
				uc++;
			}
			if(carr[i]>='0'&& carr[i]<='9')
			{	
				digit=true;
				dc++;
			}	
			if(carr[i]=='!' || carr[i]=='@'|| carr[i]=='#'|| carr[i]=='$'|| carr[i]=='%'|| carr[i]=='^'|| carr[i]=='&'|| carr[i]=='*'|| carr[i]=='('|| carr[i]==')'|| carr[i]=='-'|| carr[i]=='+')
			{
				special=true;
				sc++;
			}
 			
		}
		System.out.println("lc ::"+lc+"   uc ::"+uc+"    dc ::"+dc+"    sc ::"+sc);
		if(lc==0)
			c++;
		if(uc==0)
			c++;
		if(dc==0)
			c++;
		if(sc==0)
			c++;
		System.out.println(lowerCase && upperCase && digit && special && leng);
		System.out.println("c :: "+c+"    note ::"+note);
		
		if(note>c) {
			System.out.println(note+"  ::n");
		    return note;	
		}
		else if(c>note) {
			System.out.println(c+ " s::c");
			return c;
		}
		return c;
    }

}



//if(carr[i]=='!' || )
//digit=true;