package com.hackerRankAlgo;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDiffrence {

	public static void main(String[] args) {

		
		List<List<Integer>> list  = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(11);
		l1.add(2);
		l1.add(4);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(4);
		l2.add(5);
		l2.add(6);
		
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(10);
		l3.add(8);
		l3.add(-12);
		
		list.add(l1);
		list.add(l2);
		list.add(l3);
		
		
		diagonalDifference(list);
	}

	public static int diagonalDifference(List<List<Integer>> arr) {

		int sum1=0,sum2=0, n=0 , k=0 , l=arr.size()-1;
		for(int i=0;i<arr.size();i++)
		{
			sum1=sum1+arr.get(i).get(i);
			sum2=sum2+arr.get(k).get(l);
			k++;
			l--;
		}
		System.out.println(sum1+" ::sum1");
		System.out.println(sum2+" ::sum2");
		int diff = Math.abs(sum1-sum2);
		return diff;
	}

}
