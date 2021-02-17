package com.leetcodesolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascalTrianle1 {

	public static void main(String[] args) {
		generate(5);
	}

	public static List<List<Integer>> generate(int n) {
		
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		 
		if(n==0) return triangle;
	    List<Integer> first_row = new ArrayList<Integer>();
	    first_row.add(1);
	    triangle.add(first_row);
		
	    
	    for(int i=1;i<n;i++)
	    {
	    	List<Integer> previousRow = triangle.get(i-1);
	    	List<Integer> row = new ArrayList<Integer>();
	    	
	    	row.add(1);
	    	for(int j=1;j<i;j++)
	    	{
	    		row.add(previousRow.get(j-1)+previousRow.get(j));
	    		System.out.println(row);
	    	}
	    	
	    	row.add(1);
	    	triangle.add(row);
	    	
	    }
	    System.out.println(triangle);
	    return triangle;
	}
}


//List<Integer> l1 = new ArrayList<Integer>();
//List<Integer> l2 = new ArrayList<Integer>();
//List<Integer> l3 = new ArrayList<Integer>();
//
//l.add(l1);
//l.add(l2);
//l.add(l3);
//
//System.out.println(l);
