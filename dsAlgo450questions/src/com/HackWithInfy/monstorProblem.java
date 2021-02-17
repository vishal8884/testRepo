package com.HackWithInfy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class monstorProblem {

	public static void main(String[] args) {

		int n=3;
		int exp=100;
		int[] mon_pow = {101 , 100 , 304};
		int[] mon_bon = {100 , 1 ,524};
		totalMonstorsDefeated(n,exp,mon_pow,mon_bon);
	}
	
	
	
	public static void totalMonstorsDefeated(int n,int exp,int[] monstor_power , int[] monstor_bonus)
	{
		int c=0,note=0;
		int tempExp = exp;
		for(int i=0;i<n;i++)
		{
			System.out.println("exp outside ::"+exp+"   i::"+i);
			note=i;
			if(exp>=monstor_power[i])
			{
				c++;
				exp=exp+monstor_bonus[note];
				System.out.println(exp +"   i::"+i);
				
			}
			
			
			
			
		}
		
		System.out.println("count ::"+c);
	}

}



//Scanner sc = new Scanner(System.in);
//System.out.println("Enter no of monstors");
//int n = sc.nextInt();
//System.out.println("enter experience");
//int exp = sc.nextInt();
//System.out.println("power of monstors");
//int[] monstor_power = new int[n];
//for(int i=0;i<n;i++)
//{
//	monstor_power[i]=sc.nextInt();
//}
//System.out.println("Enter monstor bonus");
//int[] monstor_bonus = new int[n];
//for(int i=0;i<n;i++)
//{
//	monstor_bonus[i]=sc.nextInt();
//}


//List<Integer> list = new ArrayList<Integer>();



//
//
//System.out.println("n :"+n);
//System.out.println("exp :"+exp);
//System.out.println("monstor_power :"+Arrays.toString(monstor_power));
//System.out.println("monstor_bonus :"+Arrays.toString(monstor_bonus));









//if(tempExp+monstor_bonus[i]==exp)
//{
//	i=0;
//}





//int n=3;
//int exp=100;
//int[] mon_pow = {101 , 100 , 304};
//int[] mon_bon = {100 , 1 ,524};
//totalMonstorsDefeated(n,exp,mon_pow,mon_bon);




//int n=2;
//int exp=123;
//int[] mon_pow = {78 , 130};
//int[] mon_bon = {10,0};
//totalMonstorsDefeated(n,exp,mon_pow,mon_bon);